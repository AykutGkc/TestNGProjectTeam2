package tests.US19_OrdersDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.VendorGirisPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_SepeteEkleme {
    VendorGirisPage vendorGirisPage = new VendorGirisPage();
    MyAccountPage myAccountPage=new MyAccountPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));

        js.executeScript("arguments[0].click();", vendorGirisPage.vendorsignin); //Tiklamayi bu sekilde handle ederiz
        //email girilir
        js.executeScript("arguments[0].click();", vendorGirisPage.vendorusername);
       vendorGirisPage.vendorusername.sendKeys(ConfigReader.getProperty("emaild" ),Keys.TAB);
        //password girilir
        vendorGirisPage.vendorpassword.sendKeys(ConfigReader.getProperty("passwordd"));
        ReusableMethods.waitWithThreadSleep(4);
        vendorGirisPage.vendorsigninbutonu.click();
        ReusableMethods.waitWithThreadSleep(4);
        js.executeScript("arguments[0].click();", vendorGirisPage.vendorsearchbox);
        vendorGirisPage.vendorsearchbox.sendKeys("Ayakkabı", Keys.ENTER);
        myAccountPage.addtoCartSimgesi.click();


    }
}
