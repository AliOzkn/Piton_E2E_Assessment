
package Tests.EventModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_2 extends EventModuleMethods {

    //User should view validation errors if click the Create Event button without fill the event form

    @BeforeClass
    void beforeClass() {
        createEvent();
        eventAssert.clickCreateNewEventBtn();
    }

    @Test(description = "Bilgi girilmeden etkinlik olusturulmaya calisirsa, etkinlik adinin gerekli oldugu mesajini kontrol eder.")
    void checkRequiredEventNameMessage() {
        System.out.println(eventAssert.getRequiredEventNameText());
        assertEquals(eventAssert.getRequiredEventNameText(), "Event name field is required");

    }

    @Test(description = "Bilgi girilmeden etkinlik olusturulmaya calisirsa, etkinlik tarihinin gerekli oldugu mesajini kontrol eder.")
    void checkRequiredEventDateMessage() {
        System.out.println(eventAssert.getRequiredDateText());
        assertEquals(eventAssert.getRequiredDateText(), "Please choose a valid date");

    }

    @Test(description = "Bilgi girilmeden etkinlik olusturulmaya calisirsa, katilimci adının gerekli oldugu mesajini kontrol eder.")
    void checkRequiredParticipantNameMessage() {
        System.out.println(eventAssert.getRequiredParticipantNameText());
        assertEquals(eventAssert.getRequiredParticipantNameText(), "Participant name is required");

    }

    @Test(description = "Bilgi girilmeden etkinlik olusturulmaya calisirsa, katilimci soyadının gerekli oldugu mesajini kontrol eder.")
    void checkRequiredParticipantLastNameMessage() {
        System.out.println(eventAssert.getRequiredParticipantLastNameText());
        assertEquals(eventAssert.getRequiredParticipantLastNameText(), "Participant last name is required");

    }

    @Test(description = "Bilgi girilmeden etkinlik olusturulmaya calisirsa, katilimci iletisim bilgisinin gerekli oldugu mesajini kontrol eder.")
    void checkRequiredEmailMessage() {
        System.out.println(eventAssert.getRequiredEmailText());
        assertEquals(eventAssert.getRequiredEmailText(), "Please enter email or phone number");

    }
}

