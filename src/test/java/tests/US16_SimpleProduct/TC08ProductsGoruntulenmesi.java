package tests.US16_SimpleProduct;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.ProductsPages;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC08ProductsGoruntulenmesi {
    @Test public void Test8() throws InterruptedException {
        MyAccountPage myAccount= new MyAccountPage();
        StoreManager  storeManager= new StoreManager();
        MyAccountPage myAccountPage = new MyAccountPage();
        ProductsPages productsPages = new ProductsPages();
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccount.accountButton.click();
        myAccount.accountsignInButton.click();

        myAccount.usernameSignInInput.sendKeys(ConfigReader.getProperty("kullaniciadi"));
        myAccount.passwordSignInInput.sendKeys(ConfigReader.getProperty("sifree"));
        myAccount.signInloginButton.click();

        //Kullanici My account linkine tiklar
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //doucmentten sonrasini Copy Js Path olarak koopyalayip yapistirilir
        WebElement text = (WebElement) js.executeScript("return document.querySelector(\"#menu-item-1079 > a\")");
        js.executeScript("arguments[0].click();", text); //Tiklamayi bu sekilde handle ederiz

        //Kullanici Store Manager secenegine tiklar
        storeManager.storeManagerLink.click();

        //Kullanici Products secenegine tiklar
        storeManager.productsLink.click();

        //Kullanici "Add New" butonuna tiklar
        storeManager.addNewProduct.click();

        //Kullanici "Variable Product" i secer
        storeManager.variablePruductDdm.click();


        storeManager.productTitleBox.sendKeys("VAZO", Keys.ENTER);

        storeManager.featuredImage.click();
        storeManager.featuredImageUploadButton.click();
        Thread.sleep(3000);
        storeManager.featuredImageSelect.click();
        storeManager.selectButton.click();
        ReusableMethods.click(storeManager.galleryImage);
        //    myAccount.mediaLibraryItem.click();
        storeManager.selectImageForGallery.click();
        storeManager.addToGalleryButton.click();

        //Tags eklenebilmeli
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", productsPages.tagselect);
        productsPages.tagselect.clear();
        productsPages.tagselect.sendKeys("#vazo");

        //Kullanıcı Categories seçer
        ReusableMethods.click(productsPages.categoriess);
        Thread.sleep(2000);
        //Catalog visibility; Shop and search results, Shop only, Search results only, Hidden olarak seçilebilmeli
        ReusableMethods.click(productsPages.catalogvisibility);
        Select option1 =new Select(productsPages.catalogvisibility);
        option1.selectByValue("hidden");

        //checkbox
       ReusableMethods.click(productsPages.checkboxVirtual);
        //Kullanici Sale Price ($) text box kısmına ücret yazabilmelidir
        //Kullanıcı Product Title, Short Description ve Description yazar
        Thread.sleep(2000);
        Driver.getDriver().switchTo().frame("excerpt_ifr");
        productsPages.sDescription.sendKeys("xxxxxx");
        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().frame("description_ifr");
        productsPages.ddescription.sendKeys("yyyyyyy");
        Driver.getDriver().switchTo().defaultContent();
        ReusableMethods.click(storeManager.submitButon);
        Thread.sleep(2000);
        Assert.assertTrue(storeManager.published.isDisplayed());
        Driver.closeDriver();


    }
}
