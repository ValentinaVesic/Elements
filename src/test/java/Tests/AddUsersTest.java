package Tests;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddUsersTest extends BaseTest {
    /*// Nastavak na prethodni zadatak
// Na pocetku obrisati prethodno unete rekorde da na kraju ostanu samo vasi
// Napravite novu klasu za ovaj test u Tests paketu
// Napravite jednu metodu da dodate jednog korisnika
// Jednu metodu za vise korisnika (vise od jednog)
// Asertujte da li su prikazani vasi uneti podaci*/


@BeforeClass
    public void pageSetUp(){
    driver.navigate().to("https://demoqa.com/");
}

@Test
    public void addingAUser(){
    scrollToElement(homepagePage.getElementsButton().get(0));
    homepagePage.clickOnCard("Elements");
    sidebarPage.clickOnButton("Web Tables");
    webTablesPage.deleteRows();
    Assert.assertEquals(webTablesPage.rowsFilled(), 0);
   //
    //registrationPage.addUser("Marija","Markovic","test@mail.com","20","43","gr");
}

@Test
    public void addingMultipleUsers(){
    scrollToElement(homepagePage.getElementsButton().get(0));
    homepagePage.clickOnCard("Elements");
    scrollToElement(sidebarPage.getButton().get(0));
    sidebarPage.clickOnButton("Web Tables");
    scrollToElement(webTablesPage.getDeleteButton());
    webTablesPage.deleteRows();
    scrollToElement(webTablesPage.getAddRecordButton());
    for (int i = 1; i<= excelReader.getLastRow("Sheet1"); i++){
        webTablesPage.getAddRecordButton().click();
        registrationPage.getFirstNameField().sendKeys(excelReader.getStringData("Sheet1", i, 0));
        registrationPage.getLastNameField().sendKeys(excelReader.getStringData("Sheet1", i, 1));
        registrationPage.getEmailField().sendKeys(excelReader.getStringData("Sheet1", i, 2));
        registrationPage.getAgeField().sendKeys(excelReader.getStringData("Sheet1", i, 3));
        registrationPage.getSalaryField().sendKeys(excelReader.getStringData("Sheet1", i, 4));
        registrationPage.getDepartmentField().sendKeys(excelReader.getStringData("Sheet1", i, 5));
        registrationPage.getAddUserButton().click();
    }
}
}
