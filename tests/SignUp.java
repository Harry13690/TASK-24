package task_24.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import task_24.baseclass.BaseTest;
import java.time.LocalTime;

import static task_24.utilities.ElementUtils.*;

public class SignUp extends BaseTest {

   @Test
    public void validSignUp(){

       toClick(signUpPage.signinbtn1);

       LocalTime localTime = java.time.LocalTime.now();
       toSend(signUpPage.usernamefield, localTime.toString());

       toSend(signUpPage.passfield, "sample@123");

       toClick(signUpPage.signinbtn2);

       wait.until(ExpectedConditions.alertIsPresent());

       String text = toAlertText();
       Assert.assertEquals(text, "Sign up successful.");

       toAlertAccept();
   }

    @Test
    public void invalidSignUp(){

        toClick(signUpPage.signinbtn1);

        toSend(signUpPage.usernamefield, "Harry03");

        toSend(signUpPage.passfield, "sample@123");

        toClick(signUpPage.signinbtn2);

        wait.until(ExpectedConditions.alertIsPresent());

        String text = getDriver().switchTo().alert().getText();
        Assert.assertEquals(text, "This user already exist.");

        toAlertAccept();
    }
}
