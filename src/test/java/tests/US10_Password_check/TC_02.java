package tests.US10_Password_check;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VendorHome;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class TC_02 {

    /*
     Kullanici ana sayfaya gider
     Kullanici sag ust kösede register yazisini görür
     Kullanici sag üst kösedeki register yazisina tiklar
     Kullanici acilan pencerenin en altinda  Became  Vendor yazisina tiklar "
     Kullanici Vendor Registration sayfasina gider
     Kullanici password kutucuguna tiklar
     Kullanici password kutucuguna 6 karakater uzunlugunda veri girer                   //aaaaaa
     "Kullanici password kutucugunun altinda  week yazisini görür"

     */

    VendorHome home_pagehamit = new VendorHome();


    @Test
    public void TC_02(){


        //    Kullanici ana sayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarket_url"));

        //  Kullanici sag ust kösede register yazisini görür
        Boolean register_goruluyor= home_pagehamit.register.isDisplayed();
        System.out.println(register_goruluyor);
        Assert.assertTrue(register_goruluyor);
        /*
        2.YOL
        Assert.assertTrue(Reasubale_metods.element_gorunuyor_mu(home_pages.register));
        */


        //Kullanici sag üst kösedeki register yazisina tiklar
        home_pagehamit.register.click();

        //Kullanici acilan pencerenin en altinda  "Became  Vendor "yazisina tiklar
        ReusableMethods.bekle(2);
        home_pagehamit.Became_vendor.click();

        //Kullanici Vendor Registration sayfasina gider
        Assert.assertTrue(home_pagehamit.Vendor_registratio_yazisi.isDisplayed());

        // Kullanci password kutucuguna tiklar
        ReusableMethods.click(home_pagehamit.password_kutucugu);
        // PASSWORD KUTUCUGU JAVA SCRIPT KODLARI ILE YAZILMIS : BUNDAN DOLAYI REASUBALE METODDAKI CLICK ILE  CALISTI


        // Kullanici password kutucuguna 6 karakater uzunlugunda veri girer                   //aaaaaa
        home_pagehamit.password_kutucugu.sendKeys("aaaaaa");

        //Kullanici password kutucugunun altinda "too short " uyari mesajini görür
        Assert.assertTrue(home_pagehamit.too_short_yazisi.getText().equals("Weak"));




    }
}
