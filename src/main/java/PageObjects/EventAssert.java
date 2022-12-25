package PageObjects;

import Components.ReUsableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// Assertion ları yapmak için gereken locator ve metodları içeren sınıftır.
public class EventAssert extends ReUsableMethods {
    public int count = 1;

    public EventAssert(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Create New Event']")
    WebElement createNewEventBtn;
    @FindBy(xpath = "//span[text()='Add Participant']")
    WebElement addParticipantBtn;
    @FindBy(xpath = "//*[text()='delete']")
    WebElement removeParticipantBtn;
    @FindBy(css = ".section-title")
    WebElement createEventText;
    @FindBy(id = "mat-error-2")
    WebElement eventNameRequiredText;
    @FindBy(id = "mat-error-3")
    WebElement dateRequiredText;
    @FindBy(id = "mat-error-4")
    WebElement participantNameRequiredText;
    @FindBy(id = "mat-error-5")
    WebElement participantLastNameRequiredText;
    @FindBy(id = "mat-error-6")
    WebElement emailRequiredText;
    @FindBy(xpath = "//*[text()='Please add participant!']")
    WebElement removedParticipantsText;

    // Yeni etkinlik oluşturma butonuna tıklar.
    public void clickCreateNewEventBtn() {
        wait(createNewEventBtn);
        createNewEventBtn.click();
    }

    // Katılımcı ekleme butonuna tıklar.
    public void clickAddParticipantBtn() {
        wait(addParticipantBtn);
        addParticipantBtn.click();
        count++;
    }

    // Katılımcı silme butonuna tıklar.
    public void clickRemoveParticipantBtn() {
        wait(removeParticipantBtn);
        removeParticipantBtn.click();
    }

    // Başarılı şekilde etkinlik oluşturunca çıkan bildirimi gösterir.
    public boolean isCreateEventTextDisplayed() {
        wait(createEventText);
        return createEventText.isDisplayed();
    }

    // Bilgileri girmeden etkinlik oluşturulmaya çalışılırsa çıkan hata mesajlarını gösteren metodlar.
    public String getRequiredEventNameText() {
        wait(eventNameRequiredText);
        return eventNameRequiredText.getText();
    }

    public String getRequiredDateText() {
        wait(dateRequiredText);
        return dateRequiredText.getText();
    }

    public String getRequiredParticipantNameText() {
        wait(participantNameRequiredText);
        return participantNameRequiredText.getText();
    }

    public String getRequiredParticipantLastNameText() {
        wait(participantLastNameRequiredText);
        return participantLastNameRequiredText.getText();
    }

    public String getRequiredEmailText() {
        wait(emailRequiredText);
        return emailRequiredText.getText();
    }

    // Katılımcı silinince çıkan mesajı gösterir.
    public String getRemovedParticipantsText() {
        wait(removedParticipantsText);
        return removedParticipantsText.getText();
    }

}
