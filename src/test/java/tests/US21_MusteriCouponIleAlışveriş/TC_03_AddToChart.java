package tests.US21_MusteriCouponIleAlışveriş;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_03_AddToChart {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccountPage.accountButton.click();
        myAccountPage.accountsignInButton.click();
        //email girilir
        myAccountPage.usernameSignInInput.sendKeys(ConfigReader.getProperty("email"));
        //password girilir
        myAccountPage.passwordSignInInput.sendKeys(ConfigReader.getProperty("password"));
        myAccountPage.signInloginButton.click();
        ReusableMethods.waitWithThreadSleep(4);
        //SearchBox a tıklar
        myAccountPage.searchBox.click();
        ReusableMethods.waitWithThreadSleep(2);
        //SearchBox a aradığı ürünü girer
        myAccountPage.searchBox.sendKeys("Ayakkabı", Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(3);
        //SearchBox a aradığı ürünü girdikten sonra sepete ekler
        myAccountPage.addtoCartSimgesi.click();
    }
}

