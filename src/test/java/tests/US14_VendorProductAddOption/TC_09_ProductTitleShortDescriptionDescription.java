package tests.US14_VendorProductAddOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_09_ProductTitleShortDescriptionDescription extends VendorProductAddOptionWebBase{
    StoreManager storeManager;
    @Test
    public void ProductTitleShortDescriptionDescription() {
        storeManager=new StoreManager();
        storeManager.productTitle.sendKeys(ConfigReader.getProperty("textProductTitle"),
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,ConfigReader.getProperty("textShortDescription"),
                Keys.TAB,Keys.TAB,ConfigReader.getProperty("textDescription"));

        String productTitle=storeManager.productTitle.getAttribute("value");
        Assert.assertTrue(productTitle.equals(ConfigReader.getProperty("textProductTitle")));

        Driver.getDriver().switchTo().frame(0);
        String shortDescpriction=storeManager.textShortDescription.getText();
        Assert.assertTrue(shortDescpriction.equals(ConfigReader.getProperty("textShortDescription")));

        Driver.getDriver().switchTo().parentFrame();
        Driver.getDriver().switchTo().frame(1);
        String descpriction=storeManager.textDescription.getText();
        Assert.assertTrue(descpriction.equals(ConfigReader.getProperty("textDescription")));






    }
}
