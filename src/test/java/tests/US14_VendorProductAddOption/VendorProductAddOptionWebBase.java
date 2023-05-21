package tests.US14_VendorProductAddOption;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
import pages.MyAccountPage;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class VendorProductAddOptionWebBase {
    StoreManager storeManager=new StoreManager();
    @BeforeMethod
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));//pearly Adresine Gidildi
        MyAccountPage myAccountPage=new MyAccountPage();
        myAccountPage.signin.click();//Sign in Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.username.click();//UsernameK kismi Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.username.sendKeys(ConfigReader.getProperty("VendorE_Mail"));//Email girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.password.click();//Password tiklandi
        myAccountPage.password.sendKeys(ConfigReader.getProperty("VendorPassword"));//Password girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.signinSubmit.click();//Sing in tiklandi
        myAccountPage.signout.click();//Signout tiklandi
        myAccountPage.storeManeger.click();//StoreManager tiklanir
        myAccountPage.product.click();//Product tiklanir
        myAccountPage.addNew.click();//Addnew tiklanir


    }

    @AfterMethod
    public void tearDown() {
        //Driver.closeDriver();
    }
}
