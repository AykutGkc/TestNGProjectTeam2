package tests.US05_AccountDetails;

import org.openqa.selenium.JavascriptExecutor;
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

        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));//pearly Adresine Gidildi
        MyAccountPage myAccountPage=new MyAccountPage();
        myAccountPage.signin.click();//Sign in Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.username.click();//UsernameK kismi Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.username.sendKeys(ConfigReader.getProperty("NewEmailAddress"));//Email girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.password.click();//Password tiklandi
        myAccountPage.password.sendKeys(ConfigReader.getProperty("passwordSuhass"));//Password girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.signinSubmit.click();//Sing in tiklandi
        myAccountPage.signout.click();//Signout tiklandi
        ReusableMethods.scroll(myAccountPage.accountDetails);
        myAccountPage.accountDetails.click();

    }




    @AfterTest
    public void tearDown() {
        Driver.closeDriver();

    }

    public static void saveChangesAndSucces(){
        MyAccountPage myAccount = new MyAccountPage();
        AccountDetailsPage accountDetailsPage =new AccountDetailsPage();

        ReusableMethods.scroll(myAccount.saveChangesButton);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",myAccount.saveChangesButton ); //Tiklamayi bu sekilde handle ederiz
        Assert.assertTrue(accountDetailsPage.changeSucces.isDisplayed());
    }
    


}
