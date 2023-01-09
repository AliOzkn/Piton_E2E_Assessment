
package Tests.EventModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_5 extends EventModuleMethods {

    // User should be able to create new event if fills all required fields and redirect to dashboard page with create successful message

    @BeforeClass
    void beforeClass() {
        fillEventFields();
    }

    @Test(description = "Dogru sayfada oldugumuzu dogrular.")
    void checkDashboardPageUrl() {
        assertEquals(driver.getCurrentUrl(), "https://e2e-assessment.piton.com.tr/dashboard");
    }

    @Test(description = "Basarili bir sekilde etkinlik olusturulursa gelecek bilgilendirmeyi kontrol eder.")
    void checkSuccessfulMessage() {
        assertEquals(dashboard.getEventCreatedMessage(), "Event created successfully");
    }


}
