package tests.US12_VendorBillingAddress;


import com.aventstack.extentreports.ExtentReports;
import org.openqa.selenium.Keys;
        import org.openqa.selenium.support.ui.Select;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import pages.MyAccountPage;
        import utilities.ConfigReader;
        import utilities.Driver;
        import utilities.ReusableMethods;

public class TC_02_VendorBillingAddressPositivTest {

    @Test
    public void billingAddressTest() throws InterruptedException {

ReusableMethods.extentReportParametreli("Nihat","billingAddressTest" );
        Driver.getDriver().get(ConfigReader.getProperty("site_Url"));
ReusableMethods.extentTest.info("Siteye gidildi.");
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
        Thread.sleep(4);
        Assert.assertTrue(myAccountPage.billingAddress.isDisplayed());
        Thread.sleep(2000);

        ReusableMethods.scroll(myAccountPage.logout);
        Thread.sleep(3000);

        myAccountPage.editBillingButonu.click();
        Thread.sleep(2000);

        ReusableMethods.scroll(myAccountPage.firstName);
        Thread.sleep(3000);

        myAccountPage.firstName.click();
        myAccountPage.firstName.clear();
        myAccountPage.firstName.sendKeys(ConfigReader.getProperty("firstname"),
                Keys.TAB, ConfigReader.getProperty("lastname"),
                Keys.TAB, ConfigReader.getProperty("company"));
        Thread.sleep(3000);

        Select select;
        select = new Select(myAccountPage.dropdown);
        select.selectByVisibleText("Turkey");
        Thread.sleep(3000);

        myAccountPage.streetAdres.clear();
        Thread.sleep(2000);
        myAccountPage.streetAdres.sendKeys(ConfigReader.getProperty("streetAddress"),
                Keys.TAB, ConfigReader.getProperty("apartment"),
                Keys.TAB, ConfigReader.getProperty("postcode"),
                Keys.TAB, ConfigReader.getProperty("city"));

        Thread.sleep(2000);

        Select select1 = new Select(myAccountPage.provinceDropdown);
        select1.selectByVisibleText("Hakkari");

        Thread.sleep(2000);

        myAccountPage.phone.clear();
        myAccountPage.phone.sendKeys(ConfigReader.getProperty("phone"));

        Assert.assertTrue(myAccountPage.kayitliEmail.isDisplayed());
        Thread.sleep(2000);

        myAccountPage.saweAddress.click();
        Thread.sleep(2000);

        String alert = myAccountPage.savedshippingAddressAllert.getText();
        Assert.assertTrue(alert.contains("Address changed successfully."));

        myAccountPage.signOut.click();
        ReusableMethods.scroll(myAccountPage.logout);
        Thread.sleep(2000);
        myAccountPage.logout.click();

        ReusableMethods.extentReports.flush();
        Driver.closeDriver();



    }
}