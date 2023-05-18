package tests.US13_VendorShippingAddress;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class TC_02_VendorShippingAddressNegativTest {

    @Test
    public void negativeTest() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("site_Url"));
        MyAccountPage myAccountPage = new MyAccountPage();

        myAccountPage.signIn.click();
        myAccountPage.signInEmail.sendKeys(ConfigReader.getProperty("emailKullanici"),
                Keys.TAB, ConfigReader.getProperty("passwordKullanici"), Keys.ENTER);
        myAccountPage.signInLogin.click();
        Assert.assertTrue(myAccountPage.signOut.isDisplayed());
        ReusableMethods.scrollEnd();
        Thread.sleep(3000);

        myAccountPage.myaccount.click();
        Thread.sleep(2000);
        myAccountPage.address.click();
        Thread.sleep(3000);
        Assert.assertTrue(myAccountPage.shippingAddress.isDisplayed());
        Thread.sleep(2000);

        ReusableMethods.scroll(myAccountPage.wishlist);

        Thread.sleep(3000);

        myAccountPage.editShippingButon.click();
        Thread.sleep(2000);
        ReusableMethods.scroll(myAccountPage.firstnameShipping);



        myAccountPage.firstnameShipping.clear();
        myAccountPage.firstnameShipping.sendKeys(ConfigReader.getProperty("firstnameFailS"),
                Keys.TAB, ConfigReader.getProperty("lastnameFailS"), Keys.TAB, ConfigReader.getProperty("company"));


        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);

        Select select = new Select(myAccountPage.ulkeShipping);
        select.selectByVisibleText("Turkey");
        Thread.sleep(3000);


        myAccountPage.postShipping.clear();
        Thread.sleep(3000);

        myAccountPage.StreetAdresShipping.clear();
        myAccountPage.StreetAdresShipping.sendKeys(ConfigReader.getProperty("streetAddress"));

        myAccountPage.postShipping.sendKeys(ConfigReader.getProperty("postcodeFailS"),
                Keys.TAB, ConfigReader.getProperty("cityFailS"));

        ReusableMethods.waitWithThreadSleep(2);
        Select select1 = new Select(myAccountPage.provinceShipping);
        select1.selectByVisibleText("Hakkari");
        myAccountPage.saweAddress.click();

        String alert = myAccountPage.savedshippingAddressAllert.getText();
        Assert.assertTrue(alert.contains("Address changed successfully."));

        myAccountPage.signOut.click();
        ReusableMethods.scroll(myAccountPage.logout);
        Thread.sleep(2000);
        myAccountPage.logout.click();

        Driver.closeDriver();

    }
}
