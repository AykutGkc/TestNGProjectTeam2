package tests.US16_SimpleProduct;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ProductsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class TC05SalePriceTextBox {
    @Test public void Test5() throws InterruptedException {
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

        //Kullanici en ustteki dropdown da Simple Product i default olarak secili gorur
        ProductsPages productsPages = new ProductsPages();
        Assert.assertTrue(productsPages.simpleProductDropdown.isDisplayed());
       /* Actions actions=new Actions(Driver.getDriver());
       actions.moveToElement(myAccountPage.price).dragAndDropBy(myAccountPage.price,150,0).build().perform();

        */

        //Kullanici Sale Price ($) text box kısmına ücret yazabilmelidir
        ProductsPages productsPages1 = new ProductsPages();
        productsPages1.salePrice.sendKeys("50");
        productsPages1.salePrice.isEnabled();

    }
}
