package TestComponents;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Properties;


    /* Her testten önce çalıştırılacak driver'ı ayağa kaldırma; her testten sonra çalışacak driver'ı kapatma
       ve bir testin başarısız olması durumunda ekran görüntüsümü alacak metodları içeren sınıftır. */

public class BaseTest {

    public WebDriver driver;
    static Properties properties;

    @BeforeTest
    public void setUp() {
        properties = ConfigReader.initializeProperties();
        driver = DriverSetup.initializeDriver(properties.getProperty("browser"));
    }

    @AfterTest
    public void driverClose() {
        driver.quit();
    }

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
        FileUtils.copyFile(source, file);
        return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
    }
}
