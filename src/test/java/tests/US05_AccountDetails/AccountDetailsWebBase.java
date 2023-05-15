package tests.US05_AccountDetails;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.AccountDetailsPage;
import pages.HomePage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AccountDetailsWebBase {

    @BeforeTest
    public void setUp() {

        HomePage homePage = new HomePage();
        MyAccountPage myAccountPage = new MyAccountPage();
        Driver.getDriver().get(ConfigReader.getProperty("homePage_Url"));
        homePage.signIn.click();
        //Giris yapildi
        homePage.usernameOrEmailAddressKutusu.sendKeys(ConfigReader.getProperty("NewEmailAddress"), Keys.TAB, ConfigReader.getProperty("passwordSuhass"), Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(3);
        ReusableMethods.scrollEnd();
        ReusableMethods.visibleWait(homePage.myAccount, 15);

        //MyAccount sayfasina gidildi

        homePage.myAccount.click();
        ReusableMethods.waitWithThreadSleep(3);
        ReusableMethods.scrollEnd();
        ReusableMethods.waitWithThreadSleep(3);
        //Account Details sayfasina tiklandi
        myAccountPage.accountDetails.click();

    }

    @AfterTest
    public void tearDown() {
        Driver.closeDriver();

    }

    public static void saveChangesAndSucces(){
        MyAccountPage myAccount = new MyAccountPage();
        AccountDetailsPage accountDetailsPage =new AccountDetailsPage();

        myAccount.saveChangesButton.click();
        Assert.assertTrue(accountDetailsPage.changeSucces.isDisplayed());
    }

}
