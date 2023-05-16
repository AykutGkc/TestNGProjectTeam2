package tests.US05_AccountDetails;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_04_PasswordChange extends AccountDetailsWebBase{
    AccountDetailsPage accountDetailsPage;
    @Test
    public void PasswordChange() {
        accountDetailsPage=new AccountDetailsPage();

        ReusableMethods.scroll(accountDetailsPage.PasswordChangeText);
        accountDetailsPage.oldPasswordBox.sendKeys(ConfigReader.getProperty("passwordSuhass"),
                Keys.TAB,ConfigReader.getProperty("passwordSuhass"),
                Keys.TAB,ConfigReader.getProperty("passwordSuhass"));
        AccountDetailsWebBase.saveChangesAndSucces();

    }
}
