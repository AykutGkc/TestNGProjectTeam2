package tests.US15_Product;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.MyAccountRmzn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC04_Attributes {
    @Test
    public void Attributes() {

        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));//pearly Adresine Gidilir
        MyAccountPage myAccountPage=new MyAccountPage();
        myAccountPage.signin.click();//Sign in tiklanir
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.username.click();//UsernameK kismi Tiklanir
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.username.sendKeys(ConfigReader.getProperty("usernameOrEmail"));//Email girilir
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.password.click();//Password tiklandi
        myAccountPage.password.sendKeys(ConfigReader.getProperty("password"));//Password girilir
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.signinSubmit.click();//Sing in tiklanir
        myAccountPage.signout.click();//Signout tiklanir
        myAccountPage.storeManeger.click();//StoreManager tiklanir
        myAccountPage.product.click();//Product tiklanir
        myAccountPage.addNew.click();//Addnew tiklanir
        Actions actions=new Actions(Driver.getDriver());//Action Objesi tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();//Sayfanin asagina gidilir
        actions.sendKeys(Keys.ARROW_DOWN).perform();////Sayfanin asagina gidilir



        myAccountPage.attributtes.click();
        myAccountPage.color.sendKeys(ConfigReader.getProperty("color"+Keys.ENTER));
        myAccountPage.visibleOnTheProductPage.click();//VisibleOntheProductPage tiklenir
        myAccountPage.size.sendKeys(ConfigReader.getProperty("size"+Keys.ENTER));





    }
}

