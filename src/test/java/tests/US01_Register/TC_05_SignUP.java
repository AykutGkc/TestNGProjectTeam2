package tests.US01_Register;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05_SignUP {
    @Test
    public void test2() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        HomePage homePage=new HomePage();
        homePage.register.click();
        ReusableMethods.waitWithThreadSleep(3);
        homePage.signup.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.sendKeys("sadasda", Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.sendKeys("ereluzturk123@gmail.com",Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.password.sendKeys("sfdsdfsaA");
        ReusableMethods.waitWithThreadSleep(2);
        homePage.iAgree.click();
        ReusableMethods.waitWithThreadSleep(2);
        Assert.assertTrue(homePage.signupButon.isDisplayed());
        ReusableMethods.waitWithThreadSleep(4);

        Driver.closeDriver();


    }
}
