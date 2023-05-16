package tests.US20;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.MyAccountMurat;
import utilities.ConfigReader;
import utilities.Driver;

public class US20 {
    @Test
    public void testUS20() {

        Driver.getDriver().get(ConfigReader.getProperty("perarlyMRK"));
        MyAccountMurat myAccountMurat= new MyAccountMurat();
        myAccountMurat.signIn.click();
        myAccountMurat.username.sendKeys("mansur.lakeland@fullangle.org"+ Keys.ENTER);
        myAccountMurat.password.sendKeys("gmbnn8C@"+Keys.ENTER);
        myAccountMurat.tikla.click();
        myAccountMurat.signOut.click();
        myAccountMurat.storeManager.click();
        myAccountMurat.Coupons.click();
        myAccountMurat.addNew.click();
        myAccountMurat.title.sendKeys("1234");
        myAccountMurat.descrption.sendKeys("yeni kod");
        myAccountMurat.discount_type.sendKeys(""+ Keys.ENTER);
        myAccountMurat.coupon_amount.sendKeys("120");
        myAccountMurat.expiry_date.sendKeys("2023-12-12");





    }
}
