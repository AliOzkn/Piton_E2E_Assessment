
package Tests.DashboardModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Case_6 extends EventModuleMethods {

    // User should be able to view event participants

    @Test(description = "Katilimcilar butonuna tiklayinca, etkinlikteki katilimcilarin gosterildigini kontrol eder.")
    void checkEventParticipants() {
        fillEventFields();
        dashboard.clickParticipantsBtn();
        assertTrue(dashboard.getParticipantsInformation().contains("Tester1 tester1@tester1.com"));
    }

}

