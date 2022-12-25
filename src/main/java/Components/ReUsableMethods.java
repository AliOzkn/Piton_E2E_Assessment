package Components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Birden fazla kez kullanılması gereken metodlar oluşturulur. Bu sınıf, PageObject sınıflarında extend edilerek kullanılır.
public class ReUsableMethods {
    WebDriver driver;
    WebDriverWait wait;
    public ReUsableMethods(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Her metodda kullanılan explicit wait komutunu içerir.
    public void wait(WebElement findBy) {
        wait.until(ExpectedConditions.visibilityOf(findBy));
    }

}
