package task_24.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import task_24.pages.AddToCartPage;
import task_24.pages.LoginPage;
import task_24.pages.SignUpPage;

import java.time.Duration;

public class BaseTest {

    private static WebDriver driver;
    public WebDriverWait wait;
    public SignUpPage signUpPage;
    public LoginPage loginPage;
    public AddToCartPage homePage;

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        homePage = new AddToCartPage(driver);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }
}
