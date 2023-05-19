package tests.US12_VendorBillingAddress;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US13_VendorShippingAddress {
    @Test
    public void vendorShippingAddress() {

        Driver.getDriver().get(ConfigReader.getProperty("site_Url"));
        MyAccountPage myAccountPage = new MyAccountPage();


        String pearlyMarkt = Driver.getDriver().getWindowHandle();

        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW);
        Driver.getDriver().get(ConfigReader.getProperty("fakeSite"));
        String fakeSite = Driver.getDriver().getWindowHandle();





    }
}
