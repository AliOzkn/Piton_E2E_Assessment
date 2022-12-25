package TestComponents;


import PageObjects.Dashboard;
import PageObjects.Login;


    // Test senaryolarında birden fazla kez kullanılacak metodları içeren sınıftır. Senaryolara extend edilerek kullanılır.
public abstract class LoginModuleMethods extends BaseTest{
    public Login login;
    public Dashboard dashboard;

    protected void createObject(){
        login = new Login(driver);
    }

    // Form için başarılı giriş yapar.
    protected void login()  {
        createObject();
        login.inputUserName(DriverSetup.properties.getProperty("username"));
        login.inputPassword(DriverSetup.properties.getProperty("password"));
        login.clickLoginBtn();

    }

    // Form için başarısız giriş yapar.
    protected void failedLogin(){
        createObject();
        login.inputUserName("wrong username");
        login.inputPassword("wrong password");
        login.clickLoginBtn();
    }

}
