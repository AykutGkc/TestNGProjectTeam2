<<<<<<<< HEAD:src/test/java/tests/US06_US07SesrchBox/US06.java
package tests.US06_US07SesrchBox;
========
package tests.US06_UserShopping;
>>>>>>>> master:src/test/java/tests/US06_UserShopping/US06.java

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SepetLocates;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US06 {
   SepetLocates sepetLocates;
    @Test
    public void testsearchbox() {

//Kullanici pearly market sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarketUrl"));
               sepetLocates=new SepetLocates();
        ReusableMethods.waitWithThreadSleep(3);
        //Search boxta ürün aratir  Ürünü sepete at BUTONUNA TIKLAR
        sepetLocates.search.sendKeys("Kitchen Table", Keys.ENTER);
        sepetLocates.addcartbutton.click();
        //Sepete tiklar
       sepetLocates.sepet.click();
       //Ürünün sepette görür
       Assert.assertTrue(sepetLocates.KitchenTableText.isDisplayed());
       //Sepette tikladigi ürün yazisini görür
       Assert.assertEquals(sepetLocates.KitchenTableText.getText(),"Kitchen Table");
       //Ürün Sepetine Geri dönmek icin viewcart butonuna tiklar   //Ürünün sayisini arttirir
        sepetLocates.viewcartbutton.click();sepetLocates.plusbutton.click();ReusableMethods.waitWithThreadSleep(3);
        //sepeti günceller ve sepete tiklar
        sepetLocates.updatebutton.click();sepetLocates.sepet.click();ReusableMethods.waitWithThreadSleep(3);
      //sepette sayinin arttigini görür
     Assert.assertTrue(sepetLocates.yeniürünsayisicarpifiyat1.isDisplayed(),"ürünün arrtigini görür");
     sepetLocates.viewcartbutton.click();ReusableMethods.waitWithThreadSleep(3);
     //Ürün sayisini azaltir ve günceller
     sepetLocates.minusbutton.click();
     sepetLocates.updatebutton.click(); ReusableMethods.waitWithThreadSleep(3);
     sepetLocates.sepet.click();

       sepetLocates.viewcartbutton.click();
     /*   Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();*/
        //sayfayi asagi indirir
       Actions actions1=new Actions(Driver.getDriver());ReusableMethods.waitWithThreadSleep(3);
       actions1.sendKeys(Keys.PAGE_DOWN).perform();ReusableMethods.waitWithThreadSleep(3);

//fatura bölümüne gider
        sepetLocates.proceedtocheckout.click();ReusableMethods.waitWithThreadSleep(3);
        Actions actions2=new Actions(Driver.getDriver());  actions2.sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).  sendKeys(Keys.ARROW_DOWN).perform();

     sepetLocates.firstname.sendKeys("sevil",Keys.TAB,"kesen",Keys.TAB,Keys.TAB);;
Driver.getDriver().findElement(By.xpath("(//*[@value='DE'])[1]")).click();
    Select select2 = new Select(sepetLocates.ddm);
        select2.selectByVisibleText("Germany");

        Select select1=new Select(sepetLocates.ddm2);
        select1.selectByVisibleText("Berlin");
        ReusableMethods.waitWithThreadSleep(3);


        sepetLocates.streetadress.sendKeys("hauptsr11");ReusableMethods.waitWithThreadSleep(1);
          sepetLocates.town.sendKeys("Reutlingem");
sepetLocates.zipcode.sendKeys("76543");
sepetLocates.phone.sendKeys("017634660854");
sepetLocates.mail.sendKeys("fatmakesen2023@gmail.com");
sepetLocates.placeorder.submit();
WebElement element=Driver.getDriver().findElement
        (By.xpath("//p[text()='Thank you. Your order has been received.']"));
String text=element.getText();
//formu doldurur ve basariyla alisverisi tammamlar
Assert.assertEquals(text,"Thank you. Your order has been received.");
    }
}