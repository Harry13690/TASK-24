package task_24.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

    private WebDriver driver;

    public AddToCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'s7')]")
    public WebElement prodlink;

    @FindBy(xpath = "//a[text()='Add to cart']")
    public WebElement addtocartbtn;
}
