package tests.US20_FormCouponByVenor;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US20 {
    @Test
    public void testUS20() {

        Driver.getDriver().get(ConfigReader.getProperty("perarlyMRK"));
        MyAccountPage myAccountPage= new MyAccountPage();
        myAccountPage.signIn.click();
        myAccountPage.username.sendKeys("mansur.lakeland@fullangle.org"+ Keys.ENTER);
        myAccountPage.password.sendKeys("gmbnn8C@"+Keys.ENTER);
        myAccountPage.tikla.click();
        myAccountPage.signOut.click();
        myAccountPage.storeManager.click();
        Actions actions=new Actions(Driver.getDriver());//Action Objesi tiklandi

        actions.sendKeys(Keys.ARROW_DOWN).perform();////Sayfanin asagina gidilir
        myAccountPage.Coupons.click();
        myAccountPage.addNew.click();
        myAccountPage.title.sendKeys("1234");
        myAccountPage.descrption.sendKeys("yeni kod");
        myAccountPage.discount_type.sendKeys(""+ Keys.ENTER);
        myAccountPage.coupon_amount.sendKeys("120");
        myAccountPage.expiry_date.sendKeys("2023-12-12");





    }
}
