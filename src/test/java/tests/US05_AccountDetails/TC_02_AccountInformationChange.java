package tests.US05_AccountDetails;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.security.Key;

public class TC_02_AccountInformationChange {
    AccountDetailsPage accountDetailsPage;
    MyAccountPage myAccountPage;
    @Test
    public void AccontInformationChange() {

        //First name, Last name, Display name ve Email address bilgilerini değiştirebilmeli

        accountDetailsPage= new AccountDetailsPage();
        myAccountPage=new MyAccountPage();
        ReusableMethods.goToAccountDetails();
        accountDetailsPage.FirstNameKutusu.sendKeys(ConfigReader.getProperty("NewName"), Keys.TAB,
                ConfigReader.getProperty("NewSurname"),Keys.TAB,Keys.DELETE,
                ConfigReader.getProperty("NewDisplayName"),Keys.TAB,Keys.DELETE,
                ConfigReader.getProperty("NewEmailAddress"));
        ReusableMethods.scrollEnd();
        myAccountPage.saveChangesButton.click();
        Assert.assertTrue(accountDetailsPage.changeSucces.isDisplayed());


    }
}