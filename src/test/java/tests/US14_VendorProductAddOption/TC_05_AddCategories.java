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

public class TC_05_AddCategories extends VendorProductAddOptionWebBase{
    StoreManager storeManager;

    @Test
    public void addCategories() {
        storeManager=new StoreManager();
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        storeManager.addNewCategoriesButton.click();
        storeManager.categoryNameBox.sendKeys(ConfigReader.getProperty("textForaddCategories"));
        storeManager.addButtonCategories.click();
        String newCategory = ConfigReader.getProperty("textForaddCategories");
        WebElement newCategoryWE = Driver.getDriver().findElement(By.xpath("//*[text()='" + newCategory + "']"));
        Assert.assertTrue(newCategoryWE.isDisplayed());

    }
}
