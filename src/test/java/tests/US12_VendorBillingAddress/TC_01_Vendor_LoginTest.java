package tests.US12_VendorBillingAddress;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_Vendor_LoginTest {
    @Test
    public void loginTest() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("site_Url"));
        MyAccountPage myAccountPage = new MyAccountPage();

        myAccountPage.signIn.click();
        myAccountPage.signInEmail.sendKeys(ConfigReader.getProperty("emailKullanici"),
                Keys.TAB, ConfigReader.getProperty("passwordKullanici"), Keys.ENTER);
        myAccountPage.signInLogin.click();
        Assert.assertTrue(myAccountPage.signOut.isDisplayed());

        myAccountPage.signOut.click();
        ReusableMethods.scroll(myAccountPage.logout);
        Thread.sleep(2000);
        myAccountPage.logout.click();

        Driver.closeDriver();
    }
}
