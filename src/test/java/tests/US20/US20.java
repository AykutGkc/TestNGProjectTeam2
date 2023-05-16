package tests.US20;

import org.openqa.selenium.Keys;
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
        myAccountPage.Coupons.click();
        myAccountPage.addNew.click();
        myAccountPage.title.sendKeys("1234");
        myAccountPage.descrption.sendKeys("yeni kod");
        myAccountPage.discount_type.sendKeys(""+ Keys.ENTER);
        myAccountPage.coupon_amount.sendKeys("120");
        myAccountPage.expiry_date.sendKeys("2023-12-12");





    }
}
