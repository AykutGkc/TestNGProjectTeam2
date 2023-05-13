package tests.US02_Register;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.*;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class TC_03_Password_NegatifTest {
    @Test
    public void test1() throws FileNotFoundException {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resourcesErel/veri.xlsx", "veriler");
        System.out.println(Arrays.deepToString(excelUtils.getDataArray()));
    }
    @Test(dataProvider = "passWord",dataProviderClass = DataProviderUtils.class)
    public void test2(String passWord) {
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        HomePage homePage=new HomePage();
        homePage.register.click();
        ReusableMethods.waitWithThreadSleep(3);
        homePage.signup.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.username.sendKeys("erel123", Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.email.sendKeys("erel@gmail.com",Keys.TAB);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.password.sendKeys(passWord);
        ReusableMethods.waitWithThreadSleep(2);
        homePage.iAgree.click();
        ReusableMethods.waitWithThreadSleep(2);
        homePage.signupButon.click();
        ReusableMethods.waitWithThreadSleep(4);

        Driver.closeDriver();


    }
}

