package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomepagePage extends BaseTest {

    WebDriver driver;
    WebElement elementsButton;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

//    public WebElement getElementsButton() {
//        return driver.findElement(By.className("card-body"));
//    }

    public List<WebElement> getElementsButton() {
        return driver.findElements(By.className("card-body"));
    }

    //-----------------------

    /*public void clickOnElements() {
        getElementsButton().get(0).click();
    }

    public void clickOnForms() {
        getElementsButton().get(1).click();
    }*/

    /*public void clickOnElements() {
        for (int i = 0; i < getElementsButton().size(); i++) {
            if (getElementsButton().get(i).getText().equals("Elements")) {
                getElementsButton().get(i).click();
                break;
            }
        }
    }

    public void clickOnForms() {
        for (int i = 0; i < getElementsButton().size(); i++) {
            if (getElementsButton().get(i).getText().equals("Forms")) {
                getElementsButton().get(i).click();
                break;
            }
        }
    }

    public void clickOnAlerts() {
        for (int i = 0; i < getElementsButton().size(); i++) {
            if (getElementsButton().get(i).getText().equals("Alerts, Frame & Windows")) {
                getElementsButton().get(i).click();
                break;
            }
        }
    }*/

    public void clickOnCard(String cardName) {
        for (int i = 0; i < getElementsButton().size(); i++) {
            if (getElementsButton().get(i).getText().equals(cardName)) {
                getElementsButton().get(i).click();
                break;
            }
        }
    }

}