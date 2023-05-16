package tests.US15_Product;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 {

    @Test
    public void test1() {

        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));//pearly Adresine Gidildi
        MyAccountPage myAccountRmzn=new MyAccountPage();
        myAccountRmzn.signin.click();//Sign in Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.username.click();//UsernameK kismi Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.username.sendKeys(ConfigReader.getProperty("usernameOrEmail"));//Email girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.password.click();//Password tiklandi
        myAccountRmzn.password.sendKeys(ConfigReader.getProperty("password"));//Password girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.signinSubmit.click();//Sing in tiklandi
        myAccountRmzn.signout.click();//Signout tiklandi
        myAccountRmzn.storeManeger.click();//StoreManager tiklanir
        myAccountRmzn.product.click();//Product tiklanir
        myAccountRmzn.addNew.click();//Addnew tiklanir
        Actions actions=new Actions(Driver.getDriver());//Action Objesi tiklandi
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();//Sayfanin asagina gidilir
        actions.sendKeys(Keys.ARROW_DOWN).perform();////Sayfanin asagina gidilir
        Assert.assertTrue(myAccountRmzn.invontery.isDisplayed());//Inventory gorulur oldugu dogrulanir.
        Assert.assertTrue(myAccountRmzn.shipping.isDisplayed());//Shhipping bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(myAccountRmzn.attributtes.isDisplayed());//Attribuutes bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(myAccountRmzn.linked.isDisplayed());//Linked bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(myAccountRmzn.seo.isDisplayed());//Seo bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(myAccountRmzn.toptanUrunGosterme.isDisplayed());//Toptan Urun Gosterme bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(myAccountRmzn.advanced.isDisplayed());//Advanced bolumun gorulur oldugu dogrulanir

        System.out.println("TC01 BASARILI ILE SONUCLANDI");
















    }
}
