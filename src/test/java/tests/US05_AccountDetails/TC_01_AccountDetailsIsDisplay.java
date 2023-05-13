package tests.US05_AccountDetails;

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

        myAccount =new MyAccountPage();

        //US-05 TC-01 Kullanıcı hesap detaylarını (Account Details) görebilmeli

        ReusableMethods.goToAccountDetails();
        ReusableMethods.scrollEnd();
        Assert.assertTrue(myAccount.saveChangesButton.isDisplayed());
        Driver.closeDriver();
    }
}
