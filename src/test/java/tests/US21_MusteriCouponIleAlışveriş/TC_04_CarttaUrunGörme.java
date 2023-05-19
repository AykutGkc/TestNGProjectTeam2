package tests.US21_MusteriCouponIleAlışveriş;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ShoppingCartPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_04_CarttaUrunGörme {
    MyAccountPage myAccountPage = new MyAccountPage();
    ShoppingCartPages shoppingCartPages=new ShoppingCartPages();
    HomePage homePage=new HomePage();
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccountPage.accountButton.click();
        myAccountPage.accountsignInButton.click();
        myAccountPage.usernameSignInInput.sendKeys(ConfigReader.getProperty("emaild"));
        myAccountPage.passwordSignInInput.sendKeys(ConfigReader.getProperty("passwordd"));
        myAccountPage.signInloginButton.click();
        ReusableMethods.waitWithThreadSleep(4);
        myAccountPage.searchBox.click();
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.searchBox.sendKeys("Yastık", Keys.ENTER);
        ReusableMethods.visibleWait(homePage.myAccount, 15);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", myAccountPage.addtoCartSimgesi); //Tiklamayi bu sekilde handle ederiz
        Assert.assertTrue(shoppingCartPages.viewCart.isEnabled());
    }
}
