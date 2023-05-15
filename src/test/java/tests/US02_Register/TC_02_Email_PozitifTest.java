package tests.US02_Register;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02_Email_PozitifTest {
    HomePage homePage;
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        //email girilmeli
        homePage=new HomePage();
        homePage.register.click();
        ReusableMethods.waitWithThreadSleep(3);
        homePage.signup.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.sendKeys("erelozturk@gmail.com");
        Assert.assertTrue(homePage.username.isEnabled());
    }
}
