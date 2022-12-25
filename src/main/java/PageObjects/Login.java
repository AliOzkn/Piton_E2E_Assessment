package PageObjects;

import Components.ReUsableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


   // Login sayfasındaki elementleri ve test için kullanılacak metodları içeren sınıftır.
public class Login extends ReUsableMethods {
    public Login(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "body .login-header")
    WebElement loginHeader;
    @FindBy(css = "#username")
    WebElement userName;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(xpath = "//span[text()='Login']")
    WebElement loginBtn;
    @FindBy(id = "mat-error-0")
    WebElement userNameRequiredText;
    @FindBy(id = "mat-error-1")
    WebElement passwordRequiredText;
    @FindBy(id = "welcomeUserMessage")
    WebElement welcomeMessage;

    // Form adını gösterir.
    public String getHeaderText() {
        wait(loginHeader);
        return loginHeader.getText();
    }

    // Username, password ve login alanlarının aktif olduğunu doğrulamada kullanılacak metodlar.
    public boolean isUsernameEnabled() {
        return userName.isEnabled();
    }

    public boolean isPasswordEnabled() {
        return password.isEnabled();
    }

    public boolean isLoginBtnEnabled() {
        return loginBtn.isEnabled();
    }

    // Kullanıcı adı ve şifre girişinde kullanılacak metodlar.
    public void inputUserName(String uname) {
        wait(userName);
        userName.sendKeys(uname);
    }
    public void inputPassword(String pass) {
        wait(password);
        password.sendKeys(pass);
    }

    // Login butonuna tıklar.
    public void clickLoginBtn() {
        wait(loginBtn);
        loginBtn.click();
    }

    // Kullanıcı adı ve şifre girilmeden login butonuna tıklayınca, ekrana gelen hata mesajları için kullanılacak metodlar.
    public String getUsernameRequiredText() {
        wait(userNameRequiredText);
        return userNameRequiredText.getText();
    }

    public String getPaswordRequiredText() {
        wait(passwordRequiredText);
        return passwordRequiredText.getText();
    }

    // Başarılı bir şekilde giriş yapınca dashboard da çıkan Hoşgeldin mesajı için kullanılacak metod.
    public String getWelcomeMessage() {
        wait(welcomeMessage);
        return welcomeMessage.getText();
    }




}
