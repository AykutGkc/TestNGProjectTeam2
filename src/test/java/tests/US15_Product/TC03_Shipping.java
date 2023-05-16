package tests.US15_Product;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.MyAccountRmzn;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC03_Shipping {

    @Test
    public void shippingProcess() {

        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));//pearly Adresine Gidildi
        MyAccountPage myAccountRmzn=new MyAccountPage();
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

        myAccountRmzn.shipping.click();
        myAccountRmzn.weight.sendKeys(ConfigReader.getProperty("weight"+Keys.ENTER));
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.length.sendKeys(ConfigReader.getProperty("length"+Keys.ENTER));
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.height.sendKeys(ConfigReader.getProperty("width"+Keys.ENTER));
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.height.sendKeys(ConfigReader.getProperty("height"+Keys.ENTER));
        ReusableMethods.waitWithThreadSleep(2);




    }
}
