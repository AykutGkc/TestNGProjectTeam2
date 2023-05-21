package tests.US16_SimpleProduct;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC07_US15Islem {
    @Test public void Test7() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        MyAccountPage myAccountRmzn=new MyAccountPage();
        myAccountRmzn.signin.click();
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.username.click();
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.username.sendKeys(ConfigReader.getProperty("kullaniciadi"));
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.password.click();
        myAccountRmzn.password.sendKeys(ConfigReader.getProperty("sifree"));
        ReusableMethods.waitWithThreadSleep(2);
        myAccountRmzn.signinSubmit.click();
       ReusableMethods.click(myAccountRmzn.signout);
        myAccountRmzn.storeManeger.click();
        myAccountRmzn.product.click();
        myAccountRmzn.addNew.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        Assert.assertTrue(myAccountRmzn.invontery.isDisplayed());
        Assert.assertTrue(myAccountRmzn.shipping.isDisplayed());
        Assert.assertTrue(myAccountRmzn.attributtes.isDisplayed());
        Assert.assertTrue(myAccountRmzn.linked.isDisplayed());
        Assert.assertTrue(myAccountRmzn.seo.isDisplayed());
        Assert.assertTrue(myAccountRmzn.toptanUrunGosterme.isDisplayed());
        Assert.assertTrue(myAccountRmzn.advanced.isDisplayed());
        myAccountRmzn.inventorySku.sendKeys("100"+Keys.ENTER);//Inventory bolumune 100 yazar
        myAccountRmzn.manageStock.click();//ManageStock bolumu tiklanir
        myAccountRmzn.stockQty.sendKeys(ConfigReader.getProperty("randomnumber"));

        Select select=new Select(myAccountRmzn.allowBackorders);
        select.selectByIndex(2);
        Thread.sleep(2);
        myAccountRmzn.soldindividually.click();
        myAccountRmzn.manageStock.click();

        Select select1=new Select(myAccountRmzn.stockstuckddm);
        select1.selectByVisibleText("In stock");


        Thread.sleep(5);
        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountRmzn.shipping.click();
        ReusableMethods.click(myAccountRmzn.weight);
        myAccountRmzn.weight.sendKeys("70"+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.length.sendKeys("100"+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.width.sendKeys("100"+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.height.sendKeys("20"+Keys.ENTER);
        ReusableMethods.waitWithThreadSleep(2);
        myAccountPage.shipping.submit();
        ReusableMethods.click(myAccountPage.shippingclass);
        Select option1 =new Select(myAccountPage.shippingclass);
        option1.selectByValue("_no_shipping_class");
        ReusableMethods.waitWithThreadSleep(2);
      //  ReusableMethods.click(myAccountPage.prossesingType);
      Assert.assertTrue(myAccountPage.addProduct.isDisplayed());
      Thread.sleep(2000);
      Driver.closeDriver();













    }


}
