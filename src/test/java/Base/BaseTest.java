package Base;

import Pages.HomepagePage;
import Pages.RegistrationPage;
import Pages.SidebarPage;
import Pages.WebTablesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public WebTablesPage webTablesPage;
    public RegistrationPage registrationPage;
    public WebDriverWait wait;
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepagePage = new HomepagePage(driver);
        sidebarPage = new SidebarPage(driver);
        webTablesPage = new WebTablesPage(driver);
        registrationPage = new RegistrationPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        excelReader = new ExcelReader("C:\\Users\\PC\\Downloads\\MultipleUsers.xlsx");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

}