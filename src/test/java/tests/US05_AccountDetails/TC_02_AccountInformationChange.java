package tests.US05_AccountDetails;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_02_AccountInformationChange extends AccountDetailsWebBase{
    AccountDetailsPage accountDetailsPage;
    MyAccountPage myAccountPage;
    @Test
    public void AccontInformationChange(){

        //First name, Last name, Display name ve Email address bilgilerini değiştirebilmeli

        accountDetailsPage= new AccountDetailsPage();
        myAccountPage=new MyAccountPage();

        accountDetailsPage.FirstNameBox.sendKeys(ConfigReader.getProperty("NewName"), Keys.TAB,
                ConfigReader.getProperty("NewSurname"),Keys.TAB,Keys.DELETE,
                ConfigReader.getProperty("NewDisplayName"),Keys.TAB,Keys.DELETE,
                ConfigReader.getProperty("NewEmailAddress"));
        ReusableMethods.waitWithThreadSleep(2);
        ReusableMethods.scroll(myAccountPage.saveChangesButton);
        AccountDetailsWebBase.saveChangesAndSucces();


    }
}
