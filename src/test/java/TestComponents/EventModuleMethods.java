package TestComponents;

import PageObjects.Dashboard;
import PageObjects.EventAssert;
import PageObjects.EventInfo;
import PageObjects.Login;


    // Test senaryolarında birden fazla kez kullanılacak metodları içeren sınıftır. Senaryolara extend edilerek kullanılır.
public abstract class EventModuleMethods extends BaseTest {
    public Login login;
    public Dashboard dashboard;
    public EventAssert eventAssert;
    public EventInfo eventInfo;

    // Kullanıcı girişi yaptıktan sonra yeni etkinlik oluşturmak için dashboard sayfasına gider.
    protected void createEvent() {
        login = new Login(driver);
        login.inputUserName(DriverSetup.properties.getProperty("username"));
        login.inputPassword(DriverSetup.properties.getProperty("password"));
        login.clickLoginBtn();
        dashboard = new Dashboard(driver);
        dashboard.clickCreateEventBtn();
        eventAssert = new EventAssert(driver);
    }


    // Etkinlik bilgilerini girer.
    protected void fillEventFields() {
        createEvent();
        eventInfo = new EventInfo(driver);
        eventInfo.inputEventName("test1");
        eventInfo.inputEventDescription("test automation1");
        eventInfo.openCalendar();
        eventInfo.selectMonth();
        eventInfo.selectDay();
        eventInfo.inputParticipantName("Tester1");
        eventInfo.inputParticipantLastName("Tester1");
        eventInfo.inputParticipantContact("tester1@tester1.com");
        eventInfo.clickCreateNewEventBtn();
    }

    // Girilen etkinlik bilgilerini siler.
    protected void clearEventFields() {
        eventInfo.clearEventName();
        eventInfo.clearEventDescription();
        eventInfo.clearParticipantName();
        eventInfo.clearParticipantLastName();
        eventInfo.clearParticipantContact();
    }

    // Etkinliklik bilglerini düzenler.
    protected void editEventFields() {
        dashboard.clickEditEventBtn();
        clearEventFields();
        eventInfo.inputEventName("test2");
        eventInfo.inputEventDescription("test automation2");
        eventInfo.openCalendar();
        eventInfo.selectUpdatedDay();
        eventInfo.inputParticipantName("Tester2");
        eventInfo.inputParticipantLastName("Tester2");
        eventInfo.inputParticipantContact("tester2@tester2.com");
    }

}
