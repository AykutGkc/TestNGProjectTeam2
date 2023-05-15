package tests.US21_CouponIleAlışveriş;

import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_UsernameGirme {
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccountPage.accountButton.click();
        myAccountPage.accountsignInButton.click();
        myAccountPage.usernameSignInInput.sendKeys(ConfigReader.getProperty("email"));
        myAccountPage.passwordSignInInput.sendKeys(ConfigReader.getProperty("password"));
        myAccountPage.signInloginButton.click();
        ReusableMethods.waitWithThreadSleep(4);
    }
}
