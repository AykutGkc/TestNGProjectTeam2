package tests.US06_US07SesrchBox;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Compare;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US07 {
    Compare compare;
    @Test
    public void testsearchbox() {

//Kullanici pearly market sitesine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlymarketUrl"));
compare=new Compare();
//Sayfayi asagi indirir
        ReusableMethods.scroll(compare.phone);ReusableMethods.waitWithThreadSleep(3);
//Iphone resmine tiklar
       compare.phone.click();ReusableMethods.waitWithThreadSleep(3);
//karsilastir butonuna tiklar
       compare.comparebutton.click();ReusableMethods.waitWithThreadSleep(3);
       //iphone hakkinda detayli bilgi aratir start compare butonuyla
        compare.startcomparebutton.click();ReusableMethods.waitWithThreadSleep(3);
//asagi kaydirir
        ReusableMethods.scroll(compare.degscription);ReusableMethods.waitWithThreadSleep(3);
//bilgilendirme mesajini görür
        Assert.assertTrue(compare.degscription.isDisplayed());ReusableMethods.waitWithThreadSleep(3);
     //  Anasayayfaya gelir ve anansayfaya tiklar
        ReusableMethods.scrollHome();  ReusableMethods.waitWithThreadSleep(3);
        compare.home.click();ReusableMethods.waitWithThreadSleep(3);
//ElectronicstekinIphona tiklar
ReusableMethods.click(Driver.getDriver().findElement(By.xpath("//a[text()='Smart Phone']")));
        ReusableMethods.waitWithThreadSleep(3);
        //Bi baska Iphone X14e  tiklar
        ReusableMethods.click(compare.comparebutton1);
//Compare ekler ve bi baska iPhone secer
        compare.sortby.click();ReusableMethods.waitWithThreadSleep(3);

     ReusableMethods.click(Driver.getDriver().findElement(By.xpath("(//a[@title='Compare'])[1]")));
        ReusableMethods.waitWithThreadSleep(3);
        //3 ürünü karsilastirir
        compare.startcomparebutton.click();
        //Ekrami asagi kaydirir
        ReusableMethods.scroll(compare.element);ReusableMethods.waitWithThreadSleep(3);
        //3 ürünü fiyatini fiyat basliginda görür
        Assert.assertTrue(compare.price.isDisplayed());ReusableMethods.waitWithThreadSleep(3);
        //Ürünü azaltir
        compare.xbutton.click();
    }
}