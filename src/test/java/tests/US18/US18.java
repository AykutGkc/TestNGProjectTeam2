package tests.US18;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;

import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US18 {

    @Test
    public void test18() {
        Driver.getDriver().get(ConfigReader.getProperty("perarlyMRK"));
        MyAccountPage myAccountPage= new MyAccountPage();

        myAccountPage.signIn.click();
        myAccountPage.username.sendKeys("elchonon.radek@fullangle.org"+ Keys.ENTER);
        myAccountPage.password.sendKeys("zgaxv5V@"+Keys.ENTER);
        myAccountPage.tikla.click();
        myAccountPage.signOut.click();
        myAccountPage.storeManager.click();
        myAccountPage.products.click();
        myAccountPage.addNew.click();


    }
}
