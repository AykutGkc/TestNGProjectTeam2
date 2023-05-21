package tests.US14_VendorProductAddOption;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class TC_04_CategoriesSelected extends VendorProductAddOptionWebBase{
    StoreManager storeManager;
    @Test
    public void categoriesSelected() {
        storeManager=new StoreManager();
        ReusableMethods.scroll(storeManager.categoriesText);

        for (int i = 1; i <185 ; i++) {
            WebElement checkboxes = Driver.getDriver().findElement(By.xpath("(//*[@name='product_cats[]'])["+i+"]"));
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", checkboxes); //Tiklamayi bu sekilde handle ederiz

        }
        for (int i = 1; i <185 ; i++) {
            WebElement checkboxes = Driver.getDriver().findElement(By.xpath("(//*[@name='product_cats[]'])["+i+"]"));
            Assert.assertTrue(checkboxes.isSelected());
        }

        }




}
