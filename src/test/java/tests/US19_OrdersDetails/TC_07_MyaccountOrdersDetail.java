package tests.US19_OrdersDetails;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07_MyaccountOrdersDetail {

        VendorGirisPage vendorGirisPage = new VendorGirisPage();
        MyAccountPage myAccountPage=new MyAccountPage();
        ShoppingCartPages shoppingCartPages=new ShoppingCartPages();
        BillingDetailsPages billingDetailsPages=new BillingDetailsPages();
        HomePage homePage=new HomePage();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        @Test
        public void test01() {
            Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));

            js.executeScript("arguments[0].click();", vendorGirisPage.vendorsignin); //Tiklamayi bu sekilde handle ederiz
            //email girilir
            js.executeScript("arguments[0].click();", vendorGirisPage.vendorusername);
            vendorGirisPage.vendorusername.sendKeys(ConfigReader.getProperty("emaild" ), Keys.TAB);
            //password girilir
            vendorGirisPage.vendorpassword.sendKeys(ConfigReader.getProperty("passwordd"));
            ReusableMethods.waitWithThreadSleep(4);
            vendorGirisPage.vendorsigninbutonu.click();
            ReusableMethods.waitWithThreadSleep(4);
            js.executeScript("arguments[0].click();", vendorGirisPage.vendorsearchbox);
            vendorGirisPage.vendorsearchbox.sendKeys("Ayakkabı", Keys.ENTER);
            vendorGirisPage.vendorcart.click();
            ReusableMethods.visibleWait(homePage.myAccount, 10);
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", myAccountPage.addtoCartSimgesi); //Tiklamayi bu sekilde handle ederiz
            ReusableMethods.waitWithThreadSleep(4);
            js.executeScript("arguments[0].click();", shoppingCartPages.checkout);
            ReusableMethods.waitWithThreadSleep(2);
            Assert.assertTrue(shoppingCartPages.paymentMethods.isEnabled());
            ReusableMethods.waitWithThreadSleep(3);
            shoppingCartPages.payatthedoor.click();
            //Kullanici Billing Adres alanindaki "add" secenegine tiklar
            WebElement addBillingAdressButton = (WebElement) js.executeScript("return document.querySelector(\"#main > div > div > div > div > div > div > div > div.woocommerce-Addresses.addresses.row > div:nth-child(1) > div > a\")");
            // js.executeScript("arguments[0].click();", addBillingAdressButton);
            ReusableMethods.waitWithThreadSleep(2);
            //Kullanici Fist name Alanini doldurur (Erel)
            myAccountPage.addFirstName.clear();
            ReusableMethods.waitWithThreadSleep(2);
            myAccountPage.addFirstName.sendKeys("Erel");
            ReusableMethods.waitWithThreadSleep(2);
            //Kullanici Last Name Alanini doldurur (OZTURK)
            myAccountPage.addLastName.clear();
            ReusableMethods.waitWithThreadSleep(2);
            myAccountPage.addLastName.sendKeys("OZTURK");
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
            js.executeScript("arguments[0].click();", shoppingCartPages.placeorder);

            //Kullanici ZIP Code Alanini doldurur (42000)
            myAccountPage.addBillingPostcode.clear();
            myAccountPage.addBillingPostcode.sendKeys(ConfigReader.getProperty("billingPostcode"));
            //Kullanici Phone Alanini doldurur (0652600591)
            myAccountPage.addBillingPhone.clear();
            myAccountPage.addBillingPhone.sendKeys(ConfigReader.getProperty("billingPhone"));
            ReusableMethods.waitWithThreadSleep(7);
            Assert.assertTrue(vendorGirisPage.vendororderdetail.isDisplayed());

        }
    }


