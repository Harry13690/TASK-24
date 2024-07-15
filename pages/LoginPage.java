package task_24.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login2")
    public WebElement loginbtn1;

    @FindBy(id = "loginusername")
    public WebElement usernamefield;

    @FindBy(id = "loginpassword")
    public WebElement passfield;

    @FindBy(xpath = "//button[@onClick='logIn()']")
    public WebElement loginbtn2;

    @FindBy(id = "nameofuser")
    public WebElement profilebtn;
}
