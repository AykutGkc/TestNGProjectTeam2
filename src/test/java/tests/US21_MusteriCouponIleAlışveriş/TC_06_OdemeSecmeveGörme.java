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

public class TC_06_OdemeSecmeveGörme {
    MyAccountPage myAccountPage = new MyAccountPage();
    ShoppingCartPages shoppingCartPages=new ShoppingCartPages();
    HomePage homePage=new HomePage();
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccountPage.accountButton.click();
        myAccountPage.accountsignInButton.click();
        myAccountPage.usernameSignInInput.sendKeys(ConfigReader.getProperty("email"));
        myAccountPage.passwordSignInInput.sendKeys(ConfigReader.getProperty("password"));
        myAccountPage.signInloginButton.click();
        ReusableMethods.waitWithThreadSleep(4);
        myAccountPage.searchBox.click();
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.searchBox.sendKeys("Ayakkabı", Keys.ENTER);
        ReusableMethods.visibleWait(homePage.myAccount, 15);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", myAccountPage.addtoCartSimgesi); //Tiklamayi bu sekilde handle ederiz
        ReusableMethods.waitWithThreadSleep(2);
        js.executeScript("arguments[0].click();", shoppingCartPages.checkout);
        ReusableMethods.waitWithThreadSleep(2);
        Assert.assertTrue(shoppingCartPages.paymentMethods.isEnabled());
        ReusableMethods.waitWithThreadSleep(3);
        shoppingCartPages.payatthedoor.click();
      //  Driver.closeDriver();
    }
}
