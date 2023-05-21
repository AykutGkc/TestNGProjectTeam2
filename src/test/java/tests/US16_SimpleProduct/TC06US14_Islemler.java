package tests.US16_SimpleProduct;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ProductsPages;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC06US14_Islemler {
    @Test public void Test6() throws InterruptedException {
        //Kullanıcı ilgili siteye gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrll"));


        //Kullanıcı sign in/Register butonuna tıklar
        HomePage homePage = new HomePage();
        homePage.register.click();

        //Kullanici vendor olarak uygulamaya login olur
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.username.sendKeys("Hurih7");
        myAccountPage.password.sendKeys("huri1230=");
        myAccountPage.signinSubmit.click();
        Thread.sleep(3000);

        //Kullanici anasayfada oldugunu dogrular
        Assert.assertTrue(myAccountPage.signout.isDisplayed());

        //Kullanici Sign Out butonuna tiklar
        myAccountPage.signout.click();

        //Kullanici My Account sayfasinda oldugunu gorur
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("my-account"));

        //Kullanici Store Manager butonuna tiklar
        myAccountPage.storeManager.click();

        //Kullanici Store Manager sayfasina yonlendirilir
        String urlStore = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(urlStore.contains("store"));

        //Kullanici Products butonu uzerine tıklar
        myAccountPage.product.click();

        //Acilan sekmede Add New butonuna tiklar
        MyAccountPage myAccountRmzn = new MyAccountPage();
        myAccountRmzn.addNew.click();


        //US14 deki işlemler yapılır

        //add media tuşuna basılır
        StoreManager storeManager = new StoreManager();
        storeManager.imageAddFeld.click();
        storeManager.mediaLibraryItem.click();
        storeManager.chooseImage.click();
        storeManager.selectImageButton.click();
        Assert.assertTrue(storeManager.imgRemoveButton.isDisplayed());




        ProductsPages productsPages = new ProductsPages();
        productsPages.allProductTypes.click();
        productsPages.allProductTypes.isDisplayed();


       //Kullanıcı Product Title, Short Description ve Description yazar
        Thread.sleep(3500);
        Driver.getDriver().switchTo().frame("excerpt_ifr");
        productsPages.sDescription.sendKeys("xxxxxx");
        Driver.getDriver().switchTo().parentFrame();

        Driver.getDriver().switchTo().frame("description_ifr");
        productsPages.ddescription.sendKeys("yyyyyyy");
        Driver.getDriver().switchTo().defaultContent();

        //Tags eklenebilmeli
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", productsPages.tagselect);
        productsPages.tagselect.clear();
        productsPages.tagselect.sendKeys("#vazo");



        //Kullanıcı Categories seçer
        ReusableMethods.click(productsPages.categoriess);
        Thread.sleep(2000);

        //Yeni categories oluşturulur
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", productsPages.categoriess);


        //Yeni Categories eklenebilmeli


        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", productsPages.addnew);
        productsPages.addcategoryname.sendKeys("vazo");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", productsPages.addnew2);
        Select option =new Select(productsPages.categoryname);
        option.selectByValue("15");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", productsPages.categoriesaddbuton);
        Assert.assertEquals(option.getFirstSelectedOption().getText(),"Uncategorized");


        //Product brands seçilebilmeli
        ReusableMethods.click(productsPages.productsubmit);
        Thread.sleep(3000);


        //Yeni Product brands eklenebilmeli
        ReusableMethods.click(productsPages.addproductbutonu);
        productsPages.productbrandsname.sendKeys("vazo");
        productsPages.productdropdownclick.click();
        Select option2 = new Select(productsPages.productdropdownclick);
        option2.selectByValue("517");





        //Catalog visibility; Shop and search results, Shop only, Search results only, Hidden olarak seçilebilmeli
        ReusableMethods.click(productsPages.catalogvisibility);
        Select option1 =new Select(productsPages.catalogvisibility);
        option1.selectByValue("hidden");













    }
}
