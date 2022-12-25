
package Tests.DashboardModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_4 extends EventModuleMethods {

    // User should be able navigate edit event when click the edit event button

    @Test(description = "Edit butonuna basildiginda, etkinlik bilgileri guncelleme sayfasina gidildigini kontrol eder.")
    void checkAmIInEditingEventPage(){
        fillEventFields();
        dashboard.clickEditEventBtn();
        System.out.println(driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(),"https://e2e-assessment.piton.com.tr/edit-event/1");
    }
}

