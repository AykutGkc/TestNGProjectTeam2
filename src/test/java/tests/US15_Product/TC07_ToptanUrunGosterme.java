package tests.US15_Product;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.VendorProduct;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC07_ToptanUrunGosterme {
    @Test
    public void ToptanUrunGosterme() {

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
        ReusableMethods.waitWithThreadSleep(2);

        vendorProduct.toptanUrunGosterme.click();


        Select select=new Select(vendorProduct.pieceTypeddm);
        select.selectByVisibleText("Kg");
        vendorProduct.unitPerPiece.sendKeys("10"+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        vendorProduct.minOrderQuantity.sendKeys("5"+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(5);
        Driver.closeDriver();






    }
}
