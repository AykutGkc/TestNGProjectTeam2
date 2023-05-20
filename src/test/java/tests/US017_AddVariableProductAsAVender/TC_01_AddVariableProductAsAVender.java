package tests.US017_AddVariableProductAsAVender;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_AddVariableProductAsAVender {


    StoreManager storeManager = new StoreManager();
    MyAccountPage myAccount = new MyAccountPage();


    @Test
    public void addVariableProductTest() throws InterruptedException {
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
        //                                                          doucmentten sonrasini Copy Js Path olarak koopyalayip yapistirilir
        WebElement text = (WebElement) js.executeScript("return document.querySelector(\"#menu-item-1079 > a\")");
        js.executeScript("arguments[0].click();", text); //Tiklamayi bu sekilde handle ederiz

        //Kullanici Store Manager secenegine tiklar
        storeManager.storeManagerLink.click();

        //Kullanici Products secenegine tiklar
        storeManager.productsLink.click();
        //Kullanici CampingTea maker urunune tiklar
        storeManager.teaMakerProduit.click();

        //Kullanici sayfanin altindaki secenekler bolumunden "Attributes" secenegine tiklar
        ReusableMethods.click(storeManager.attributesLink);

        //Kullanici acilan bolumden "Color" kutusunu aktif hale getirir
        storeManager.colorCheckBox.click();

        //Kullanici "Add New" butonuna tiklar
        ReusableMethods.click(storeManager.addColorButton);

        //Kullanici urunun rengini girer	Gris Metal
        ReusableMethods.alertprompt("Gris Metal4");
        ReusableMethods.alertAccept();

        //Kullanici acilan bolumden "Size" kutusunu aktif hale getirir
        ReusableMethods.click(storeManager.sizeCheckBox);

        //Kullanici "Add New" butonuna tiklar


        //Kullanici urunun "Size" larini girer	S, M, L, XL
        ReusableMethods.addSize("S--1");
        ReusableMethods.addSize("M2--");
        ReusableMethods.addSize("L--3");
        ReusableMethods.addSize("XL--4");

        //Kullanici "Add attribute" kutucuguna tiklar
        ReusableMethods.click(storeManager.addAttributeButton);

        //Kullanici "Name" bolumune urunun ismini girer	"Picnic Teapot - Semaver"
        storeManager.addAttributeName.sendKeys("Picnic Teapot - Semaver");

        //Kullanici Submit butonuna tiklar
        ReusableMethods.click(storeManager.submitButton);

        //Kullanici Sayfayi kapatir
        Driver.closeDriver();
    }
}
