package tests.US01_Register;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03_Password_PozitifTest {
    HomePage homePage;
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        //password girilmeli
        homePage=new HomePage();
        homePage.register.click();
        ReusableMethods.waitWithThreadSleep(3);
        homePage.signup.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.sendKeys("erelozturk@gmail.com");
        ReusableMethods.waitWithThreadSleep(2);
        homePage.password.sendKeys("Erel123456789");
        Assert.assertTrue(homePage.username.isEnabled());
    }
}
