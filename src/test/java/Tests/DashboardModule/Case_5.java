
package Tests.DashboardModule;


import TestComponents.EventModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Case_5 extends EventModuleMethods {

    // User should be able to delete event when click the delete button

    @BeforeClass
    void openCreateEventPage() {
        fillEventFields();
        dashboard.clickDeleteEventBtn();
    }

    @Test(description = "Tum etkinlikler silinirse listede etkinlik gozukmeyecegini kontrol eder.")
    void checkIsThereAnyEvent() {
        assertTrue(dashboard.getEventCount() == 0);
    }

    @Test(description = "Eger hic etkinlik yoksa gelecek bilgilendirme mesajini kontrol eder.")
    void checkNotificationMessage() {
        assertEquals(dashboard.getNoRegisteredEventMessage(), "No registered event has been found!!");
    }
}

