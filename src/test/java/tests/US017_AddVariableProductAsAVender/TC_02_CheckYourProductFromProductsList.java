package tests.US017_AddVariableProductAsAVender;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_02_CheckYourProductFromProductsList {
    StoreManager storeManager = new StoreManager();
    MyAccountPage myAccount = new MyAccountPage();

    @Test
    public void checkProductTest() throws InterruptedException {
         /*
        Kullanici https://pearlymarket.com/ sitesine kayitli olmalidir
        Kullanici Kayitli email bilgileri ile Login olur	lecorail242@gmail.com
        Kullanici Kayitli pasword bilgileri ile Login olur	corail123@
       */
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccount.accountButton.click();
        myAccount.accountsignInButton.click();

        myAccount.usernameSignInInput.sendKeys(ConfigReader.getProperty("emailEmre"));
        myAccount.passwordSignInInput.sendKeys(ConfigReader.getProperty("passwordEmre"));
        myAccount.signInloginButton.click();

        //Kullanici My account linkine tiklar
        Thread.sleep(8000);
        ReusableMethods.scrollEnd();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement text = (WebElement) js.executeScript("return document.querySelector(\"#menu-item-1079 > a\")");
        js.executeScript("arguments[0].click();", text);

        //Kullanici Store Manager secenegine tiklar
        storeManager.storeManagerLink.click();

        //Kullanici Products secenegine tiklar
        storeManager.productsLink.click();

        //Kullanici "Picnic Teapot - Semaver" urunun product listesinde oldugunu gorur
        String teaPot = storeManager.teaPotItem.getText();
        Assert.assertEquals(teaPot, storeManager.teaPotItem.getText());

        //Kullanici Sayfayi kapatir
        Driver.closeDriver();
    }
}
