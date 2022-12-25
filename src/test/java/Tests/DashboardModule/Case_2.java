
package Tests.DashboardModule;

import TestComponents.LoginModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_2 extends LoginModuleMethods {

    // User should redirect to login page if not authenticated
    @BeforeClass
    void beforeClass() {
        failedLogin();
    }

    @Test(description = "Dogru sayfada olduğumuzu dogrular.")
    void checkLoginPageUrl() {

        System.out.println(driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(), "https://e2e-assessment.piton.com.tr/login");
    }

    @Test(description = "Basarisiz giris yapilirsa tekrar login sayfasina yonlendirildigimizi kontrol eder.")
    void checkLoginFormHeaderText() {
        System.out.println(login.getHeaderText());
        assertEquals(login.getHeaderText(), "Event Manager Login");
    }
}

