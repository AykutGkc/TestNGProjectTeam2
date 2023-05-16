package tests.US004_AddShippingAddress;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_AddShippingAddress {
    MyAccountPage myAccount = new MyAccountPage();

    @Test
    public void addShippingAddressTest() throws InterruptedException {
        /*
        Kullanici https://pearlymarket.com/ sitesine kayitli olmalidir
        Kullanici Kayitli email bilgileri ile Login olur (lecorail242@gmail.com)
        Kullanici Kayitli pasword bilgileri ile Login olur (corail123@)
        */

        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccount.accountButton.click();
        myAccount.accountsignInButton.click();

        myAccount.usernameSignInInput.sendKeys(ConfigReader.getProperty("email"));
        myAccount.passwordSignInInput.sendKeys(ConfigReader.getProperty("password"));
        myAccount.signInloginButton.click();

        //Kullanici My account linkine tiklar
        Thread.sleep(8000);
        ReusableMethods.scrollEnd();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //                                                          doucmentten sonrasini Copy Js Path olarak koopyalayip yapistirilir
        WebElement text = (WebElement) js.executeScript("return document.querySelector(\"#menu-item-1079 > a\")");
        js.executeScript("arguments[0].click();", text); //Tiklamayi bu sekilde handle ederiz

        //Kullanici Adresses linkine tiklar
        myAccount.adressLink.click();

        //Kullanici Shipping Adres alanindaki "add" secenegine tiklar
        WebElement addShippingAdressButton = (WebElement) js.executeScript("return document.querySelector(\"#main > div > div > div > div > div > div > div > div.woocommerce-Addresses.addresses.row > div:nth-child(2) > div > a\")");
        js.executeScript("arguments[0].click();",addShippingAdressButton);

        //Kullanici Fist name Alanini doldurur (Emre)
        myAccount.addShippingFirstName.clear();
        myAccount.addShippingFirstName.sendKeys(ConfigReader.getProperty("firstName"));

        //Kullanici Last Name Alanini doldurur (Soydemir)
        myAccount.addShippingLastName.clear();
        myAccount.addShippingLastName.sendKeys(ConfigReader.getProperty("lastName"));

        //Kullanici Country/Region Alanini doldurur (France)
        Select select;
        select = new Select(myAccount.selectShippingCountyrDdm);
        select.selectByIndex(77);

        //Kullanici Street adress Alanini doldurur (Jean Pierre)
        myAccount.addShippingAddress.clear();
        myAccount.addShippingAddress.sendKeys(ConfigReader.getProperty("shippingAddress"));

        //Kullanici ZIP Code Alanini doldurur (42000)
        myAccount.addShippingPostcode.clear();
        myAccount.addShippingPostcode.sendKeys(ConfigReader.getProperty("shippingPostcode"));

        //Kullanici Town/City Alanini doldurur (St Etienne)
        myAccount.addShippingCity.clear();
        myAccount.addShippingCity.sendKeys(ConfigReader.getProperty("shippingCity"));

        //Kullanici Save adres butonuna tiklar
        WebElement saveShippingAdressButton = (WebElement) js.executeScript("return document.querySelector(\"#main > div > div > div > div > div > div > div > form > div > p > button\")");
        js.executeScript("arguments[0].click();", saveShippingAdressButton);

        //Kullanici "Address changed successfully." mesajini gorur
        String alert = myAccount.savedshippingAddressAllert.getText();

        Assert.assertTrue(alert.contains("Address changed successfully."));

        //Kullanici tarayiciyi kapatir
        Driver.closeDriver();
    }
}
