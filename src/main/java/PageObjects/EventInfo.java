package PageObjects;

import Components.ReUsableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Etkinlik bilgileri için kullanılacak locator ve metodları içeren sınıftır.
public class EventInfo extends ReUsableMethods {

    public EventInfo(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#name")
    WebElement eventName;
    @FindBy(css = "#description")
    WebElement eventDescription;
    @FindBy(xpath = "(//button[@type='button'])[1]")
    WebElement calendar;
    @FindBy(xpath = "//button[@aria-label='Next month']")
    WebElement nextMonthBtn;
    @FindBy(xpath = "(//tbody//tr)[5]//td[7]")
    WebElement day21Btn;
    @FindBy(xpath = "(//tbody//tr)[6]//td[7]")
    WebElement day28Btn;
    @FindBy(xpath = "//input[@data-placeholder='Enter first name']")
    WebElement participantName;
    @FindBy(xpath = "//input[@data-placeholder='Enter last name']")
    WebElement participantLastName;
    @FindBy(xpath = "//input[@data-placeholder='Enter email or phone']")
    WebElement participantContact;
    @FindBy(xpath = "//span[text()='Create New Event']")
    WebElement createNewEventBtn;
    @FindBy(xpath = "//*[text()='Update Event']")
    WebElement updateEventBtn;

    // Etkinlik ismi ve açıklamasını yazan metodlar.
    public void inputEventName(String ename) {
        wait(eventName);
        eventName.sendKeys(ename);
    }

    public void inputEventDescription(String desc) {
        wait(eventDescription);
        eventDescription.sendKeys(desc);
    }

    // Takvim üzerinden tarih seçen metodlar.
    public void openCalendar() {
        wait(calendar);
        calendar.click();
    }

    public void selectMonth() {
        wait(nextMonthBtn);
        nextMonthBtn.click();
    }

    public void selectDay() {
        wait(day21Btn);
        day21Btn.click();
    }

    public void selectUpdatedDay() {
        wait(day28Btn);
        day28Btn.click();
    }

    // Katılımcı bilgilerini girdiğimiz metodlar.
    public void inputParticipantName(String pname) {
        wait(participantName);
        participantName.sendKeys(pname);
    }

    public void inputParticipantLastName(String plname) {
        wait(participantLastName);
        participantLastName.sendKeys(plname);
    }

    public void inputParticipantContact(String contact) {
        wait(participantContact);
        participantContact.sendKeys(contact);
    }

    // Girilen bilgiler sonrası etkinlik oluşturma butonuna tıklar.
    public void clickCreateNewEventBtn() {
        wait(createNewEventBtn);
        createNewEventBtn.click();
    }

    // Etkinlik bilgilerini düzenledikten sonra güncelleme butonuna tıklar.
    public void clickUpdateEventBtn() {
        wait(updateEventBtn);
        updateEventBtn.click();
    }

    // Girilen etkinlik bilgilerini silen metodlar.
    public void clearEventName() {
        eventName.clear();
    }

    public void clearEventDescription() {
        eventDescription.clear();
    }

    public void clearParticipantName() {
        participantName.clear();
    }

    public void clearParticipantLastName() {
        participantLastName.clear();
    }

    public void clearParticipantContact() {
        participantContact.clear();
    }
    public String getUpdateEventBtnText(){
        return updateEventBtn.getText();
    }


}
