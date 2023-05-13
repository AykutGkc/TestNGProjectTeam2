package tests.US05_AccountDetails;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_AccountDetailsIsDisplay {
    HomePage homePage;
    MyAccountPage myAccount;
    @Test
    public void AccountDetailsISDisplay() {
        Driver.getDriver().get(ConfigReader.getProperty("homePage_Url"));

        //US-05 TC-01 Kullanıcı hesap detaylarını (Account Details) görebilmeli

        homePage = new HomePage();
        myAccount = new MyAccountPage();
        homePage.signIn.click();
        //Giris yapildi
        homePage.usernameOrEmailAddressKutusu.sendKeys(ConfigReader.getProperty("emailSuhaas"), Keys.TAB, ConfigReader.getProperty("passwordSuhass"), Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(3);
        ReusableMethods.scrollEnd();
        ReusableMethods.visibleWait(homePage.myAccount, 15);
        //MyAccount sayfasina gidildi
        homePage.myAccount.click();
        ReusableMethods.waitWithThreadSleep(3);
        ReusableMethods.scrollEnd();
        ReusableMethods.waitWithThreadSleep(3);
        //Account Details sayfasina tiklandi
        myAccount.accountDetails.click();
        ReusableMethods.scrollEnd();
        Assert.assertTrue(myAccount.saveChangesButton.isDisplayed());
        Driver.closeDriver();
    }
}
