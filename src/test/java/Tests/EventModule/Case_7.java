
package Tests.EventModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_7 extends EventModuleMethods {

    // User should be able to update event if required fields filled and redirect to dashboard page with update successful message

    @BeforeClass
    void beforeClass(){
        fillEventFields();
        editEventFields();
        eventInfo.clickUpdateEventBtn();
    }

    @Test(description = "Dogru sayfada oldugumuzu dogrular.")
    void checkDashboardPageUrl(){
        System.out.println(driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(),"https://e2e-assessment.piton.com.tr/dashboard");
    }
    @Test(description = "Etkinlik basarili bir sekilde guncellenince gelecek bilgilendirme mesajini kontrol eder.")
    void checkUpdatedMessage(){
        System.out.println(dashboard.getEventUpdatedMessage());
        assertEquals(dashboard.getEventUpdatedMessage(),"Event updated successfully");
    }

}

