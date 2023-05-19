package tests.US14_VendorProductAddOption;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class TC_03_Shipping extends VendorProductAddOptionWebBase{
    StoreManager storeManager;
    @Test
    public void shipping() {
        ReusableMethods.scroll(storeManager.shippingButton);
        storeManager.shippingButton.click();
        storeManager.weightBox.sendKeys(ConfigReader.getProperty("WeightforShipping"), Keys.TAB,
                                ConfigReader.getProperty("LengthforShipping"),Keys.TAB,
                                ConfigReader.getProperty("WidthforShipping"), Keys.TAB,
                                ConfigReader.getProperty("HeightforShipping"));



    }
}
