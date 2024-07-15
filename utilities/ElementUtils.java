package task_24.utilities;

import org.openqa.selenium.WebElement;
import task_24.baseclass.BaseTest;

public class ElementUtils extends BaseTest {

    public static void toClick(WebElement element){

        element.click();
    }

    public static void toSend(WebElement element, String text){

        element.sendKeys(text);
    }

    public static String toAlertText(){

        return getDriver().switchTo().alert().getText();
    }

    public static void toAlertAccept(){

        getDriver().switchTo().alert().accept();
    }
}
