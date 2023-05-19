package tests.US15_Product;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.VendorProduct;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC08_Advanced {
    @Test
    public void Advanced() {

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
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        ReusableMethods.waitWithThreadSleep(2);

        vendorProduct.advanced.click();
        vendorProduct.enable.click();
        vendorProduct.menuOrder.sendKeys("Test"+Keys.ENTER);
        vendorProduct.purchaseNote.sendKeys("Testimiz Basarili ile Sonuclandi "+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);

        Driver.closeDriver();
    }
}
