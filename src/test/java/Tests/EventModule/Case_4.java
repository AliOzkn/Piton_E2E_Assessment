
package Tests.EventModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_4 extends EventModuleMethods {

    // User should view error message if removes all participants

    @Test(description = "Eger etkinlikte hic katilimci yoksa gelecek hata mesajini kontrol eder.")
    void checkRemovedParticipantText() {
        createEvent();
        eventAssert.clickRemoveParticipantBtn();
        System.out.println(eventAssert.getRemovedParticipantsText());
        assertEquals(eventAssert.getRemovedParticipantsText(), "Please add participant!");
    }
}

