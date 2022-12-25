
package Tests.EventModule;


import TestComponents.EventModuleMethods;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Case_6 extends EventModuleMethods {

    // User should be able to edit event. When user click the edit button all event fields must be filled according to editing event

    @BeforeClass
    void beforeClass() {
        fillEventFields();
        editEventFields();

    }

    @Test(description = "Dogru sayfada oldugumuzu dogrular.")
    void checkEditingEventPageUrl() {
        System.out.println(driver.getCurrentUrl());
        assertEquals(driver.getCurrentUrl(), "https://e2e-assessment.piton.com.tr/edit-event/1");
    }

    @Test(description = "Edit butonuna bastigimizda etkinlik bilgilerinin guncellenebildigini kontrol eder.")
    void checkUpdateEventText() {
        System.out.println(eventInfo.getUpdateEventBtnText());
        assertEquals(eventInfo.getUpdateEventBtnText(),"Update Event");

    }


}

