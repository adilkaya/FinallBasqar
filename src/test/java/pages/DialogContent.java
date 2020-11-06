package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends _Parent{

    WebElement myElement;
    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;

    @FindBy (xpath = "//span[text()='Dashboard ']")
    private WebElement dashboard;


    public void findElementAndClickFunction(String elementName) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (elementName) {
            case "loginButton": myElement = loginButton; break;

            case "gotItBtn":

                if (gotItBtns.size() == 0) return; myElement = gotItBtn; break;
        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {
        /**
         * Buraya tıklanacak butonun adı gönderilecek
         * Burada adından hangi eleman olduğu bulunuyor
         * ve sonra tıklanıyor.
         */

        switch (elementName) {
            case "username": myElement = username;break;

            case "password": myElement = password;break;

        }
        sendKeysFunction(myElement,value);

    }

    public void findElementAndFindVerifyContainsText(String elementName, String mesaj) {
        switch (elementName) {
            case "dashboard": myElement = dashboard;break;
        }
        verifyElementContainsText(myElement, mesaj);

    }

}