
package Tests.EventModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Case_3 extends EventModuleMethods {

    //User should be able to add new participant when click the Add Participant button

    @Test(description = "Etkinlige yeni katilimci ekleme durumunu kontrol eder.")
    void checkNewParticipant()  {
        createEvent();
        eventAssert.clickAddParticipantBtn();
        System.out.println(eventAssert.count);
        assertTrue(eventAssert.count > 1);
    }
}
