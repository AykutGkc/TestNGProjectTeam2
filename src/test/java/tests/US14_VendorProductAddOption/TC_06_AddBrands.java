package tests.US14_VendorProductAddOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_06_AddBrands extends VendorProductAddOptionWebBase{
    StoreManager storeManager;

    @Test
    public void addBrands() {
        storeManager=new StoreManager();
        Actions actions=new Actions(Driver.getDriver());
        //actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();
        ReusableMethods.scroll(storeManager.addNewBrandsButton);
        storeManager.addNewBrandsButton.click();
        storeManager.brandsNameBox.sendKeys(ConfigReader.getProperty("textForaddBrands"),Keys.TAB,Keys.TAB,Keys.ENTER);
        String newBrands = ConfigReader.getProperty("textForaddBrands");
        WebElement newBrandWE = Driver.getDriver().findElement(By.xpath("//*[text()='" + newBrands + "']"));
        Assert.assertTrue(newBrandWE.isDisplayed());


    }
}
