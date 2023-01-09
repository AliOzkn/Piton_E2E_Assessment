package Tests.LoginModule;

import TestComponents.LoginModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Case_1 extends LoginModuleMethods {

    //User should see login form if not authenticated. Login Form should contain username password and login button

    @BeforeClass
    void beforeClass() {
        createObject();
    }

    @Test(description = "Dogru sayfada oldugumuzu dogrular.")
    void checkLoginPageUrl() {
        assertEquals(driver.getCurrentUrl(), "https://e2e-assessment.piton.com.tr/login");
    }

    @Test(description = "Login formunun basligini kontrol eder.")
    void checkLoginFormHeaderText() {
        assertEquals(login.getHeaderText(), "Event Manager Login");
    }

    @Test(description = "Kullanici adi alaninin aktif oldugunu dogrular.")
    void checkUserNameField() {
        assertTrue(login.isUsernameEnabled());
    }

    @Test(description = "Sifre alaninin aktif oldugunu dogrular.")
    void checkPasswordField() {
        assertTrue(login.isPasswordEnabled());
    }

    @Test(description = "Login butonunun aktif oldugunu dogrular.")
    void checkLoginBtn() {
        assertTrue(login.isLoginBtnEnabled());
    }
}
