package Tests.EventModule;

import TestComponents.EventModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Case_1 extends EventModuleMethods {

    //User should view create event form if click the Create Event button on dashboard

    @BeforeClass
    void beforeClass() {
        createEvent();
    }

    @Test(description = "Dogru sayfada oldugumuzu dogrular.")
    void checkCreateEventPageUrl() {
        System.out.println(driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(), "https://e2e-assessment.piton.com.tr/create-event");
    }

    @Test(description = "Etkinlik olusturma basligini kontrol eder.")
    void checkCreateEventHeaderText() {
        System.out.println(eventAssert.isCreateEventTextDisplayed());
        assertTrue(eventAssert.isCreateEventTextDisplayed());

    }
}

