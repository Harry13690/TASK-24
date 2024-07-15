package task_24.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

    private WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "signin2")
    public WebElement signinbtn1;

    @FindBy(id = "sign-username")
    public WebElement usernamefield;

    @FindBy(id = "sign-password")
    public WebElement passfield;

    @FindBy(xpath = "//button[@onClick='register()']")
    public WebElement signinbtn2;
}
