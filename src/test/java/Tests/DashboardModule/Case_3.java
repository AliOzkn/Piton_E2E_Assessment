
package Tests.DashboardModule;


import TestComponents.EventModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Case_3 extends EventModuleMethods {

    // User should view list of events if any event created otherwise user should view notification message states no registered event found

    @BeforeClass
    void openCreateEventPage() {
       fillEventFields();
    }

    @Test (priority = 1,description = "Etkinligin basarili bir sekilde olusturuldugunu kontrol eder.")
    void checkIsThereAnyEvent() {
        System.out.println(dashboard.getEventCount());
        assertTrue(dashboard.getEventCount() >= 1);
    }
    @Test (priority = 2,description = "Eger hic etkinlik yoksa gelecek bilgilendirme mesajini kontrol eder.")
    void checkNotificationMessage() {
        dashboard.clickDeleteEventBtn();
        System.out.println(dashboard.getNoRegisteredEventMessage());
        assertEquals(dashboard.getNoRegisteredEventMessage(),"No registered event has been found!!");
    }
}

