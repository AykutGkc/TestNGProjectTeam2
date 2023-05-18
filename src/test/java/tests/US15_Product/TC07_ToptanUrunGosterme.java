package tests.US15_Product;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.MyAccountRmzn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC07_ToptanUrunGosterme {
    @Test
    public void ToptanUrunGosterme() {

        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));//pearly Adresine Gidildi
        MyAccountRmzn myAccountRmzn=new MyAccountRmzn();
        myAccountRmzn.signin.click();//Sign in Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.username.click();//UsernameK kismi Tiklandi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.username.sendKeys(ConfigReader.getProperty("usernameOrEmail"));//Email girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.password.click();//Password tiklandi
        myAccountRmzn.password.sendKeys(ConfigReader.getProperty("password"));//Password girildi
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.signinSubmit.click();//Sing in tiklandi
        myAccountRmzn.signout.click();//Signout tiklandi
        myAccountRmzn.storeManeger.click();//StoreManager tiklanir
        myAccountRmzn.product.click();//Product tiklanir
        myAccountRmzn.addNew.click();//Addnew tiklanir
        Actions actions=new Actions(Driver.getDriver());//Action Objesi tiklandi
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();//Sayfanin asagina gidilir
        actions.sendKeys(Keys.ARROW_DOWN).perform();////Sayfanin asagina gidilir
        ReusableMethods.waitWithThreadSleep(2);

        myAccountRmzn.toptanUrunGosterme.click();


        Select select=new Select(myAccountRmzn.pieceTypeddm);
        select.selectByVisibleText("Kg");
        myAccountRmzn.unitPerPiece.sendKeys("10"+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.minOrderQuantity.sendKeys("5"+Keys.ENTER);







    }
}
