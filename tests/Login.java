package task_24.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import task_24.baseclass.BaseTest;

import static task_24.utilities.ElementUtils.*;


public class Login extends BaseTest {

    @Test
    public void validLogin(){

        toClick(loginPage.loginbtn1);

        toSend(loginPage.usernamefield, "Harry2828");

        toSend(loginPage.passfield, "Harry28");

        toClick(loginPage.loginbtn2);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));

        Assert.assertEquals(loginPage.profilebtn.getText(), "Welcome Harry2828");
    }

    @Test(priority = 1)
    public void invalidLogin1(){

        toClick(loginPage.loginbtn1);

        toSend(loginPage.usernamefield, "Harry2828");

        toSend(loginPage.passfield, "sample");

        toClick(loginPage.loginbtn2);

        wait.until(ExpectedConditions.alertIsPresent());

        Assert.assertEquals(getDriver().switchTo().alert().getText(), "Wrong password.");

        toAlertAccept();
    }

    @Test(priority = 2)
    public void invalidLogin2(){

        toClick(loginPage.loginbtn1);

        toSend(loginPage.usernamefield, "sample");

        toSend(loginPage.passfield, "Harry28");

        toClick(loginPage.loginbtn2);

        wait.until(ExpectedConditions.alertIsPresent());

        Assert.assertEquals(getDriver().switchTo().alert().getText(), "Wrong password.");

        toAlertAccept();
    }

    @Test(priority = 3)
    public void invalidLogin3(){

        toClick(loginPage.loginbtn1);

        toSend(loginPage.usernamefield, "sample");

        toSend(loginPage.passfield, "sample");

        toClick(loginPage.loginbtn2);

        wait.until(ExpectedConditions.alertIsPresent());

        Assert.assertEquals(getDriver().switchTo().alert().getText(), "Wrong password.");

        toAlertAccept();
    }
}
