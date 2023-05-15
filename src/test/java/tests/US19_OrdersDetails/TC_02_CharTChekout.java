package tests.US19_OrdersDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ShoppingCartPages;
import pages.VendorGirisPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02_CharTChekout {
    VendorGirisPage vendorGirisPage = new VendorGirisPage();
    MyAccountPage myAccountPage=new MyAccountPage();
    ShoppingCartPages shoppingCartPages=new ShoppingCartPages();
    HomePage homePage=new HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));

        js.executeScript("arguments[0].click();", vendorGirisPage.vendorsignin); //Tiklamayi bu sekilde handle ederiz
        //email girilir
        js.executeScript("arguments[0].click();", vendorGirisPage.vendorusername);
        vendorGirisPage.vendorusername.sendKeys(ConfigReader.getProperty("emaild" ), Keys.TAB);
        //password girilir
        vendorGirisPage.vendorpassword.sendKeys(ConfigReader.getProperty("passwordd"));
        ReusableMethods.waitWithThreadSleep(4);
        vendorGirisPage.vendorsigninbutonu.click();
        ReusableMethods.waitWithThreadSleep(4);
        js.executeScript("arguments[0].click();", vendorGirisPage.vendorsearchbox);
        vendorGirisPage.vendorsearchbox.sendKeys("Ayakkabı", Keys.ENTER);
        vendorGirisPage.vendorcart.click();
        ReusableMethods.visibleWait(homePage.myAccount, 15);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", myAccountPage.addtoCartSimgesi); //Tiklamayi bu sekilde handle ederiz
        Assert.assertTrue(shoppingCartPages.viewCart.isEnabled());
}
}