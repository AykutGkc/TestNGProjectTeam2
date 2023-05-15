package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US06 {
    HomePage homePage;
    @Test
    public void testsearchbox() {

//Kullanici pearly market sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarketUrl"));
                homePage=new HomePage();
        ReusableMethods.waitWithThreadSleep(3);
        //Search boxta ürün aratir  Ürünü sepete at BUTONUNA TIKLAR
        homePage.search.sendKeys("Kitchen Table", Keys.ENTER);
        homePage.addcartbutton.click();
        //Sepete tiklar
       homePage.sepet.click();
       //Ürünün sepette görür
       Assert.assertTrue(homePage.KitchenTableText.isDisplayed());
       //Sepette tikladigi ürün yazisini görür
       Assert.assertEquals(homePage.KitchenTableText.getText(),"Kitchen Table");
       //Ürün Sepetine Geri dönmek icin viewcart butonuna tiklar   //Ürünün sayisini arttirir
        homePage.viewcartbutton.click(); homePage.plusbutton.click();ReusableMethods.waitWithThreadSleep(3);
        //sepeti günceller ve sepete tiklar
        homePage.updatebutton.click(); homePage.sepet.click();ReusableMethods.waitWithThreadSleep(3);
      //sepette sayinin arttigini görür
     Assert.assertTrue(homePage.yeniürünsayisicarpifiyat1.isDisplayed(),"ürünün arrtigini görür");
     homePage.viewcartbutton.click();ReusableMethods.waitWithThreadSleep(3);
     //Ürün sayisini azaltir ve günceller
     homePage.minusbutton.click();
     homePage.updatebutton.click(); ReusableMethods.waitWithThreadSleep(3);
     homePage.sepet.click();

        homePage.viewcartbutton.click();
     /*   Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();*/
        //sayfayi asagi indirir
       Actions actions1=new Actions(Driver.getDriver());ReusableMethods.waitWithThreadSleep(3);
       actions1.sendKeys(Keys.PAGE_DOWN).perform();ReusableMethods.waitWithThreadSleep(3);

//fatura bölümüne gider
        homePage.proceedtocheckout.click();ReusableMethods.waitWithThreadSleep(3);
        Actions actions2=new Actions(Driver.getDriver());  actions2.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).  sendKeys(Keys.ARROW_DOWN).perform();

     homePage.firstname.sendKeys("sevil",Keys.TAB,"kesen");;

        ReusableMethods.waitWithThreadSleep(3);
        homePage.streetadress.sendKeys("hauptsr11");
ReusableMethods.sendKeysJS(homePage.streetadress,"hauptsr11");
        homePage.streetadress.sendKeys("hauptsr11");ReusableMethods.waitWithThreadSleep(3);
            homePage.town.sendKeys("Reutlingem");
homePage.zipcode.sendKeys("76543");
homePage.phone.sendKeys("017634660854");
homePage.mail.sendKeys("fatmakesen2023@gmail.com");
    Select select=new Select(homePage.ddmCountry);
select.selectByVisibleText("Germany");

    }
}