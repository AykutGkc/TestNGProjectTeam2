package tests.US08_Wishlist;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ProductsPages;
import pages.WishlistPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_Wishlisteekleme {

    MyAccountPage myAccountPage = new MyAccountPage();
    ProductsPages products = new ProductsPages();
    WishlistPages wishlistPages = new WishlistPages();

    @Test
    public void test01()  {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccountPage.accountButton.click();
        myAccountPage.accountsignInButton.click();
        myAccountPage.usernameSignInInput.sendKeys(ConfigReader.getProperty("email"));
        myAccountPage.passwordSignInInput.sendKeys(ConfigReader.getProperty("password"));
        myAccountPage.signInloginButton.click();
        ReusableMethods.waitWithThreadSleep(4);
        ReusableMethods.scrollEnd();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", myAccountPage.myAccount); //Tiklamayi bu sekilde handle ederiz
        ReusableMethods.waitWithThreadSleep(4);

        js.executeScript("arguments[0].click();", myAccountPage.orders);
        ReusableMethods.waitWithThreadSleep(3);
        js.executeScript("arguments[0].click();", myAccountPage.browseProducts);
        ReusableMethods.waitWithThreadSleep(4);
        js.executeScript("arguments[0].click();", products.begen);// Ürün eklendi
        ReusableMethods.waitWithThreadSleep(3);
        js.executeScript("arguments[0].click();", wishlistPages.wishlistKalp);
        ReusableMethods.waitWithThreadSleep(3);
        Assert.assertTrue(wishlistPages.erkekAyakkabı.isEnabled());

//        ReusableMethods.visibleWait(homePage.myAccount, 15);

        Driver.closeDriver();


    }
}
