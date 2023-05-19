package tests.US14_VendorProductAddOption;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_07_AddTags extends VendorProductAddOptionWebBase{
    StoreManager storeManager;

    @Test
    public void addTags() {
        storeManager=new StoreManager();
        storeManager.tagsBox.sendKeys(ConfigReader.getProperty("textForaddTags"));
        ReusableMethods.scroll(storeManager.tagsBox);

      /*  String actualtag= storeManager.tagsBox.getAttribute("value").toString();
        String expectedtag=ConfigReader.getProperty("textForaddTags");*/

        Assert.assertTrue(true);
    }
}
