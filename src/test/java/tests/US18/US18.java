package tests.US18;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.MyAccountMurat;
import utilities.ConfigReader;
import utilities.Driver;

public class US18 {

    @Test
    public void test18() {
        Driver.getDriver().get(ConfigReader.getProperty("perarlyMRK"));
        MyAccountMurat myAccountMurat= new MyAccountMurat();
        myAccountMurat.signIn.click();
        myAccountMurat.username.sendKeys("elchonon.radek@fullangle.org"+ Keys.ENTER);
        myAccountMurat.password.sendKeys("zgaxv5V@"+Keys.ENTER);
        myAccountMurat.tikla.click();
        myAccountMurat.signOut.click();
        myAccountMurat.storeManager.click();
        myAccountMurat.products.click();
        myAccountMurat.addNew.click();


    }
}
