package tests.US03_AddBillingAdress;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC_01_AddBillingAddress {
    MyAccountPage myAccount = new MyAccountPage();

    @Test
    public void addBillingAdressTest() throws InterruptedException {
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

        //Kullanici Billing Adres alanindaki "add" secenegine tiklar
        WebElement addBillingAdressButton = (WebElement) js.executeScript("return document.querySelector(\"#main > div > div > div > div > div > div > div > div.woocommerce-Addresses.addresses.row > div:nth-child(1) > div > a\")");
        js.executeScript("arguments[0].click();", addBillingAdressButton);

        //Kullanici Fist name Alanini doldurur (Emre)
        myAccount.addFirstName.clear();
        myAccount.addFirstName.sendKeys(ConfigReader.getProperty("firstName"));

        //Kullanici Last Name Alanini doldurur (Soydemir)
        myAccount.addLastName.clear();
        myAccount.addLastName.sendKeys(ConfigReader.getProperty("lastName"));

        //Kullanici Country/Region Alanini doldurur (France)
        Select select;
        select = new Select(myAccount.selectBillingCountyrDdm);
        select.selectByIndex(77);

        //Kullanici Street adress Alanini doldurur (Jeaen Pierre)
        myAccount.addBillingAddress.clear();
        myAccount.addBillingAddress.sendKeys(ConfigReader.getProperty("billingAddress"));

        //Kullanici Town/City Alanini doldurur (Saint Etienne)
        myAccount.addBillingCity.clear();
        myAccount.addBillingCity.sendKeys(ConfigReader.getProperty("billingCity"));

        //Bu sutun sonradan kaldirildi
        //Kullanici State Alanini doldurur (Loire)
   //     myAccount.addBillingState.sendKeys(ConfigReader.getProperty("billingState"));

        //Kullanici ZIP Code Alanini doldurur (42000)
        myAccount.addBillingPostcode.clear();
        myAccount.addBillingPostcode.sendKeys(ConfigReader.getProperty("billingPostcode"));

        //Kullanici Phone Alanini doldurur (0652600591)
        myAccount.addBillingPhone.clear();
        myAccount.addBillingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));

        //Kullanici email alaninda siteme kayitli email adresinin otomatik dolduruldugunu gorur
        Assert.assertTrue(myAccount.addBillingEmail.isDisplayed());

        //Kullanici Save adres butonuna tiklar
        WebElement saveAdressButton = (WebElement) js.executeScript("return document.querySelector(\"#main > div > div > div > div > div > div > div > form > div > p > button\")");
        js.executeScript("arguments[0].click();", saveAdressButton);

        //Kullanici "Address changed successfully." mesajini gorur
        String alert = myAccount.savedBillingAddressAllert.getText();

        Assert.assertTrue(alert.contains("Address changed successfully."));

        //Kullanici tarayiciyi kapatir
        Driver.closeDriver();


    }
}
