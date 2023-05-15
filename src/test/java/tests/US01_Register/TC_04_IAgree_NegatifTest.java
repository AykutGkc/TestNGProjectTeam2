package tests.US01_Register;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04_IAgree_NegatifTest {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        HomePage homePage=new HomePage();
        homePage.register.click();
        ReusableMethods.waitWithThreadSleep(3);
        homePage.signup.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.sendKeys("aasdoALD", Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.sendKeys("ereAPSl@gmail.com",Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.password.sendKeys("sfdsdfsaA4569S81");

        ReusableMethods.waitWithThreadSleep(2);
        homePage.signupButon.click();
        ReusableMethods.waitWithThreadSleep(4);
        Assert.assertFalse(homePage.signupButon.isSelected());
        ReusableMethods.waitWithThreadSleep(4);

        Driver.closeDriver();
}
}
