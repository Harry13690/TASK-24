package task_24.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import task_24.baseclass.BaseTest;

import static task_24.utilities.ElementUtils.*;

public class AddToCart extends BaseTest {

    @Test
    public void verifyProductCounts() {

        toClick(homePage.prodlink);

        toClick(homePage.addtocartbtn);

        wait.until(ExpectedConditions.alertIsPresent());

        Assert.assertEquals(toAlertText(), "Product added");

        toAlertAccept();
    }
}
