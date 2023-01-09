
package Tests.DashboardModule;

import TestComponents.LoginModuleMethods;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_1 extends LoginModuleMethods {

    // User should view dashboard if authenticated

    @Test(description = "Doğru sayfada olduğumuzu dogrular.")
    void checkDashboardPageUrl(){
        login();
        assertEquals(driver.getCurrentUrl(),"https://e2e-assessment.piton.com.tr/dashboard?navigatedFrom=login");
    }
    @Test(description = "Basarili giris yapildiginda dashboard sayfasina yönlendirildiğimizi, Hosgeldin mesaji ile kontrol eder.")
    void checkSuccessfulLogin() {
        assertEquals(login.getWelcomeMessage(), "Welcome Automation Test User");
    }
}

