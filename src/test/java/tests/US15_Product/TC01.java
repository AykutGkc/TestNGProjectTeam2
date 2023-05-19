package tests.US15_Product;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.VendorProduct;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC01 {

    @Test
    public void test1() {

        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));//pearly Adresine Gidildi
        VendorProduct vendorProduct=new VendorProduct();
        vendorProduct.signin.click();//Sign in Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        vendorProduct.username.click();//UsernameK kismi Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        vendorProduct.username.sendKeys(ConfigReader.getProperty("usernameOrEmail"));//Email girildi
        ReusableMethods.waitWithThreadSleep(2);
        vendorProduct.password.click();//Password tiklandi
        vendorProduct.password.sendKeys(ConfigReader.getProperty("password"));//Password girildi
        ReusableMethods.waitWithThreadSleep(2);
        vendorProduct.signinSubmit.click();//Sing in tiklandi
        vendorProduct.signout.click();//Signout tiklandi
        vendorProduct.storeManeger.click();//StoreManager tiklanir
        vendorProduct.product.click();//Product tiklanir
        vendorProduct.addNew.click();//Addnew tiklanir
        Actions actions=new Actions(Driver.getDriver());//Action Objesi tiklandi
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();//Sayfanin asagina gidilir
        actions.sendKeys(Keys.ARROW_DOWN).perform();////Sayfanin asagina gidilir
        Assert.assertTrue(vendorProduct.invontery.isDisplayed());//Inventory gorulur oldugu dogrulanir.
        Assert.assertTrue(vendorProduct.shipping.isDisplayed());//Shhipping bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(vendorProduct.attributtes.isDisplayed());//Attribuutes bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(vendorProduct.linked.isDisplayed());//Linked bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(vendorProduct.seo.isDisplayed());//Seo bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(vendorProduct.toptanUrunGosterme.isDisplayed());//Toptan Urun Gosterme bolumun gorulur oldugu dogrulanir
        Assert.assertTrue(vendorProduct.advanced.isDisplayed());//Advanced bolumun gorulur oldugu dogrulanir

        System.out.println("TC01 BASARILI ILE SONUCLANDI");
















    }
}
