
package Tests.LoginModule;


import TestComponents.LoginModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_2 extends LoginModuleMethods {

    //User should see validation errors if click the login button without fill the login form

    @BeforeClass
    void beforeClass() {
        createObject();
        login.clickLoginBtn();
    }

    @Test(description = "Kullanici adi girilmeden login butonuna basilirsa, hata mesjainin gosterildigini kontrol eder.")
    void checkRequiredUsernameMessage() {
        System.out.println(login.getUsernameRequiredText());
        assertEquals(login.getUsernameRequiredText(), "Username field is required");
    }

    @Test(description = "Sifre girilmeden login butonuna basilirsa, hata mesajinin gosterildigini kontrol eder.")
    void checkRequiredPasswordMessage() {
        System.out.println(login.getPaswordRequiredText());
        assertEquals(login.getPaswordRequiredText(), "Password field is required");
    }
}

