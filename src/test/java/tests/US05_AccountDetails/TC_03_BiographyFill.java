package tests.US05_AccountDetails;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountDetailsPage;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03_BiographyFill extends AccountDetailsWebBase{

        AccountDetailsPage accountDetailsPage;
        MyAccountPage myAccountPage;

    @Test
    public void biographyFill() {

        //US05 TC02 Biography bölümünü doldurabilmeli

        accountDetailsPage=new AccountDetailsPage();
        myAccountPage=new MyAccountPage();

        ReusableMethods.scroll(myAccountPage.logout);
        Driver.getDriver().switchTo().frame(0);
        accountDetailsPage.biographBox.sendKeys(ConfigReader.getProperty("BiographyData"), Keys.ENTER);
        Driver.getDriver().switchTo().parentFrame();
        ReusableMethods.scrollEnd();
        AccountDetailsWebBase.saveChangesAndSucces();

 }
}
