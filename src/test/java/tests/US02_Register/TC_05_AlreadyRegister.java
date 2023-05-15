package tests.US02_Register;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_05_AlreadyRegister {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        HomePage homePage = new HomePage();
        homePage.register.click();
        ReusableMethods.waitWithThreadSleep(3);
        homePage.signup.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.sendKeys("erel123", Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.sendKeys("erelozturkjira@gmail.com", Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.password.sendKeys("Erel.2474823");
        ReusableMethods.waitWithThreadSleep(2);
        homePage.iAgree.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.signupButon.click();
        String actual = homePage.alreadyRegister.getText();
        System.out.println(actual);
        String expected = "An account is already registered with your email address. Please log in.";
        Assert.assertEquals(homePage.alreadyRegister.getText(), expected);
        ReusableMethods.waitWithThreadSleep(2);
        Driver.closeDriver();


    }
}

