package tests.US02_Register;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_Username_PozitifTest {
    HomePage homePage;
    @Test
    public void test1() {
       Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        //Username girilmeli
        homePage=new HomePage();
        homePage.register.click();
        ReusableMethods.waitWithThreadSleep(3);
        homePage.signup.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.sendKeys("Erel123456");
       Assert.assertTrue(homePage.username.isEnabled());


    }
}
