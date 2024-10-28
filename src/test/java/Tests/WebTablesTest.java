package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


//      SKROL U TEST KLASI UVEK ZA SADA BOG I AMIN

public class WebTablesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {

        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void thereAreThreeRecords() {
        scrollToElement(homepagePage.getElementsButton().get(0));
        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Web Tables");
        Assert.assertEquals(webTablesPage.rowsFilled(), 3);
        Assert.assertTrue(webTablesPage.threeRowsFilled());
    }

    @Test
    public void userCanRemoveAllRecords() throws InterruptedException {
        scrollToElement(homepagePage.getElementsButton().get(0));
        homepagePage.clickOnCard("Elements");
        scrollToElement(sidebarPage.getButton().get(0));
        sidebarPage.clickOnButton("Web Tables");
        Assert.assertEquals(webTablesPage.rowsFilled(), 3);
        scrollToElement(webTablesPage.getDeleteButton());
        webTablesPage.deleteRows();
        Assert.assertEquals(webTablesPage.rowsFilled(), 0);
    }
// Nastavak na prethodni zadatak
// Proveriti da li korisnik moze da doda 'rekorde'
// Na pocetku obrisati prethodno unete rekorde da na kraju ostanu samo vasi
// Napravite novu klasu za ovaj test u Tests paketu
// Napravite jednu metodu da dodate jednog korisnika
// Jednu metodu za vise korisnika (vise od jednog)
// Asertujte da li su prikazani vasi uneti podaci

}

