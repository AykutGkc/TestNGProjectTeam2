package tests.US21_MusteriCouponIleAlışveriş;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.BillingDetailsPages;
import pages.MyAccountPage;
import pages.ShoppingCartPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07_AlısverisTamamlama {
    MyAccountPage myAccountPage = new MyAccountPage();
    ShoppingCartPages shoppingCartPages=new ShoppingCartPages();
    HomePage homePage=new HomePage();


    BillingDetailsPages billingDetailsPages=new BillingDetailsPages();

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
        //Kullanici Billing Adres alanindaki "add" secenegine tiklar
        WebElement addBillingAdressButton = (WebElement) js.executeScript("return document.querySelector(\"#main > div > div > div > div > div > div > div > div.woocommerce-Addresses.addresses.row > div:nth-child(1) > div > a\")");
       // js.executeScript("arguments[0].click();", addBillingAdressButton);
        ReusableMethods.waitWithThreadSleep(2);
        //Kullanici Fist name Alanini doldurur (Emre)
        myAccountPage.addFirstName.clear();
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.addFirstName.sendKeys(ConfigReader.getProperty("firstName"));
        ReusableMethods.waitWithThreadSleep(2);
        //Kullanici Last Name Alanini doldurur (Soydemir)
        myAccountPage.addLastName.clear();
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.addLastName.sendKeys(ConfigReader.getProperty("lastName"));
        ReusableMethods.waitWithThreadSleep(2);
        //Kullanici Country/Region Alanini doldurur (France)
        Select select;
        select = new Select(myAccountPage.selectBillingCountyrDdm);
        select.selectByIndex(77);
        ReusableMethods.waitWithThreadSleep(2);
        //Kullanici Street adress Alanini doldurur (Jeaen Pierre)
        myAccountPage.addBillingAddress.clear();
        ReusableMethods.waitWithThreadSleep(2);
       myAccountPage.addBillingAddress.sendKeys(ConfigReader.getProperty("billingAddress"));
        ReusableMethods.waitWithThreadSleep(2);
        //Kullanici Town/City Alanini doldurur (Saint Etienne)
        myAccountPage.addBillingCity.clear();
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.addBillingCity.sendKeys(ConfigReader.getProperty("billingCity"));
        ReusableMethods.waitWithThreadSleep(2);
     //   js.executeScript("arguments[0].click();", shoppingCartPages.placeorder);
    }
}
