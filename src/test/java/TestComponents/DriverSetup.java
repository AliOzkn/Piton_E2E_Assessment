package TestComponents;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Properties;


    // Driver başlatılırken, tarayıcı seçimi ve gerekli ayarlamaları içeren sınıftır.
public class DriverSetup {
    public static Properties properties;
    static WebDriver driver;

    public static WebDriver initializeDriver(String browser) {

        properties = ConfigReader.getProperties();
        try {
            switch (browser) {
                case "Chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--disable-popup-blocking");
                    chromeOptions.addArguments("--disable-notifications");
                    chromeOptions.addArguments("--incognito");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(chromeOptions);
                    break;
            }
        } catch (SessionNotCreatedException e) {
            System.out.println("Version Error:" + e.getLocalizedMessage());
        }

        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        return getDriver();
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
