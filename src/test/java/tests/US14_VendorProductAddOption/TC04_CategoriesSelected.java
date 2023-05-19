package tests.US14_VendorProductAddOption;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC04_CategoriesSelected extends VendorProductAddOptionWebBase{
    StoreManager storeManager;
    @Test
    public void categoriesSelected() {
        storeManager=new StoreManager();
        ReusableMethods.scroll(storeManager.categoriesText);
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//input[@name='product_cats[]']"));
        for (WebElement checkbox : checkboxes) {
            System.out.println(checkbox.getText());
        }

        for (WebElement w : checkboxes) {
            Assert.assertTrue(w.isSelected());
        }

    }
}
