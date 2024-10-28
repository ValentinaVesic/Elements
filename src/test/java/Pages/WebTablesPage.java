package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesPage {

    WebDriver driver;
    WebElement tableRow;
    WebElement deleteButton;
    WebElement addRecordButton;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getTableRow() {
        return driver.findElements(By.className("rt-tr-group"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.cssSelector("span[title='Delete']"));
    }

    public WebElement getAddRecordButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    //---------------------------

    public void getRowText() {
        for (int i = 0; i < getTableRow().size(); i++) {
            System.out.println("Row number: " + i + 1);
            boolean isEmpty = getTableRow().get(i).getText().isBlank();
            System.out.println(isEmpty);
        }
    }

    public int rowsFilled() {
        int counter = 0;
        for (int i = 0; i < getTableRow().size(); i++) {
            if (!getTableRow().get(i).getText().isBlank()) {
                counter++;
            }
        }
        return counter;
    }

    public boolean threeRowsFilled() {
        int counter = 0;
        for (int i = 0; i < getTableRow().size(); i++) {
            if (!getTableRow().get(i).getText().isBlank()) {
                counter++;
            }
        }
        if (counter == 3) {
            return true;
        } else {
            return false;
        }
    }

    public void delete() {
        getDeleteButton().click();
    }

    public void deleteRows() {
        while  (!getTableRow().get(0).getText().isBlank()){
            delete();
        }
    }


}
