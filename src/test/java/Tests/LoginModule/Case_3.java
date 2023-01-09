package Tests.LoginModule;

import TestComponents.LoginModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
public class Case_3 extends LoginModuleMethods {

    // User should navigate to the dashboard and see welcome message if authenticate successfully

    @BeforeClass
    void beforeClass()  {
        login();
    }

    @Test(description = "Dogru sayfada oldugumuzu dogrular.")
    void checkDashboardPageUrl() {
        assertEquals(driver.getCurrentUrl(), "https://e2e-assessment.piton.com.tr/dashboard?navigatedFrom=login");
    }

    @Test(description = "Basarili bir sekilde giriş yapilirsa, hosgeldin mesajinin gronup gorunmedigini kontrol eder.")
    void checkSuccessfulLogin() {
        assertEquals(login.getWelcomeMessage(), "Welcome Automation Test User");
    }

}

