package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BaseTest {
    WebDriver driver;
    WebElement firstNameField;
    WebElement lastNameField;
    WebElement emailField;
    WebElement ageField;
    WebElement salaryField;
    WebElement departmentField;
    WebElement addUserButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstNameField() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAgeField() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalaryField() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartmentField() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getAddUserButton() {
        return driver.findElement(By.id("submit"));
    }
/*
    public void addUser(String firstName, String lastName, String email, String age,
                        String salary, String department){
        webTablesPage.getAddRecordButton().click();
        getFirstNameField().clear();
        getFirstNameField().sendKeys(firstName);
        getLastNameField().clear();
        getLastNameField().sendKeys(lastName);
        getEmailField().clear();
        getEmailField().sendKeys(email);
        getAgeField().clear();
        getAgeField().sendKeys(age);
        getSalaryField().clear();
        getSalaryField().sendKeys(salary);
        getDepartmentField().clear();
        getDepartmentField().sendKeys(department);
        getAddUserButton().click();
    }*/
//public void addMultipleUsers(){




}
