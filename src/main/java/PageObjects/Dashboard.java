package PageObjects;

import Components.ReUsableMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

// Oluşturulan etkinlikleri gördüğümüz ve yeni etkinlik oluşturma sayfasına erişebildiğimiz dashboard sayfası için oluşturulan sınıftır.
public class Dashboard extends ReUsableMethods {

    public Dashboard(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "span.mat-button-wrapper")
    WebElement createEventBtn;
    @FindBy(xpath = "//button[@title='Edit Event']")
    WebElement editEventBtn;
    @FindBy(xpath = "//*[text()='delete']")
    WebElement deleteEventBtn;
    @FindBy(xpath = "//*[text()='supervised_user_circle']")
    WebElement participantsBtn;
    @FindBy(xpath = "//*[text()='Event created successfully']")
    WebElement eventCreatedMessage;
    @FindBy(xpath = "//*[text()='Event updated successfully']")
    WebElement eventUpdatedMessage;
    @FindBy(css = "tbody tr")
    List<WebElement> listOfEvents;
    @FindBy(css = "mat-card-content.mat-card-content")
    WebElement noRegisteredEventMessage;
    @FindBy(xpath = "(//tbody//tr)[2]")
    WebElement participantsInformation;


    // Etkinlik oluşturma butonuna tıklar.
    public void clickCreateEventBtn() {
        wait(createEventBtn);
        createEventBtn.click();
    }

    // Etkinliği düzenleme butonuna tıklar.
    public void clickEditEventBtn() {
        wait(editEventBtn);
        editEventBtn.click();
    }

    // Etkinliği silme butonuna tıklar.
    public void clickDeleteEventBtn() {
        wait(deleteEventBtn);
        deleteEventBtn.click();
    }

    // Katılımcıları gösteren butona tıklar.
    public void clickParticipantsBtn() {
        wait(participantsBtn);
        participantsBtn.click();
    }

    // Oluşturulan etkinliklerin sayısını alır.
    public int getEventCount() {
        return listOfEvents.size();
    }

    // "Etkinlik oluşturuldu" mesajını gösterir.
    public String getEventCreatedMessage() {
        wait(eventCreatedMessage);
        return eventCreatedMessage.getText();
    }

    // "Etkinlik güncellendi" mesajını gösterir.
    public String getEventUpdatedMessage() {
        wait(eventUpdatedMessage);
        return eventUpdatedMessage.getText();
    }

    // "Etkinlik bulunamadı" mesajını gösterir.
    public String getNoRegisteredEventMessage() {
        wait(noRegisteredEventMessage);
        return noRegisteredEventMessage.getText();
    }

    // Katılımcılar butonuna tıklayınca, katılımcı bilgilerini gösterir.
    public String getParticipantsInformation() {
        wait(participantsInformation);
        return participantsInformation.getText();
    }


}
