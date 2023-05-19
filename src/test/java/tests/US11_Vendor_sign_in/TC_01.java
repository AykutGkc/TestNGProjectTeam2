package tests.US11_Vendor_sign_in;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VendorHome;
import pages.MyaccountVendor;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01 {

/*
       Kullanici ana sayfaya gider                      	https://pearlymarket.com/
       Kullanici sag ust kösedeki sign in yazisini görür
       Kullanici sign in yazisina tiklar
       Acilan ekranda kullanici mail adresi kutucugunu tiklar
       kullanici mail adresi  kutucuguna kaydolurken kullanmis oldugu mail adresini  girer	abdulrehman.jaice@fullangle.org
       Kullanci password kutucuguna tiklar
       Kullanici password kutucuguna sifresini girer	Ab12345
       Kullanici sign in butonuna tiklar
       Kullanici acilan sayfada sag üst kösede sing out yazisini görür
       Kullanici sayfanin en altina gider
       Kullanici sayfanin en altinda Whislist yazisinin altindaki myaccount yazisina tiklar
       Kullanici acilan sayfada MY ACCOUNT yazisini görür

*/
VendorHome home_pagehamit = new VendorHome();
MyaccountVendor myaccount_pagesHamit =new MyaccountVendor();
    @Test
    public void TC_01() {


            //    Kullanici ana sayfaya gider                      	https://pearlymarket.com/
            Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

            //    Kullanici sag ust kösedeki sign in yazisini görür
            Assert.assertTrue( home_pagehamit.sign_in.isDisplayed());

            //Kullanici sign in yazisina tiklar
            home_pagehamit.sign_in.click();


             //    Acilan ekranda kullanici mail adresi kutucugunu tiklar
            home_pagehamit.sign_in_email_kutucugu.click();



            //    kullanici mail adresi  kutucuguna kaydolurken kullanmis oldugu mail adresini  girer	abdulrehman.jaice@fullangle.org
            home_pagehamit.sign_in_email_kutucugu.sendKeys("abdulrehman.jaice@fullangle.org");

            //    Kullanci password kutucuguna tiklar
            home_pagehamit.sign_in_password_kutucugu.click();


            //    Kullanici password kutucuguna sifresini girer	Ab12345
            home_pagehamit.sign_in_password_kutucugu.sendKeys("Ab12345");


            //    Kullanici sign in butonuna tiklar
            home_pagehamit.sign_in_sign_in.click();
            ReusableMethods.bekle(4);

            //    Kullanici acilan sayfada sag üst kösede sing out yazisini görür
            Assert.assertTrue(home_pagehamit.sign_out.isDisplayed());

            //    Kullanici sayfanin en altina gider
            Actions actions= new Actions(Driver.getDriver());
            actions.sendKeys(Keys.END);

            //    Kullanici sayfanin en altinda Whislist yazisinin altindaki myaccount yazisina tiklar
            ReusableMethods.click(home_pagehamit.myaccount);

            //    Kullanici acilan sayfada MY ACCOUNT yazisini görür
            Assert.assertTrue(myaccount_pagesHamit.buyuk_my_account.isDisplayed());



         }//metod
     }//class

