package tests.US_05_AccountDetails;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccount;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01_AccountDetailsIsDisplay {
    HomePage homePage;
    MyAccount myAccount;

    @Test
    public void KullaniciHesapDetaylariTesti() {
        Driver.getDriver().get(ConfigReader.getProperty("homePage_Url"));

        //US-05 TC-01 Kullanıcı hesap detaylarını (Account Details) görebilmeli

        homePage = new HomePage();
        myAccount = new MyAccount();
        homePage.signIn.click();
        //Giris yapildi
        homePage.usernamOrEmailAddressKutusu.sendKeys(ConfigReader.getProperty("emailSuhaas"), Keys.TAB, ConfigReader.getProperty("passwordSuhass"), Keys.ENTER);
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
