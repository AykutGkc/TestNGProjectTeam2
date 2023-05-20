package tests.US14_VendorProductAddOption;

import org.openqa.selenium.By;
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

        List<String> abc=new ArrayList<>();
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//input[@class='wcfm-checkbox checklist_type_product_cat ']"));
        for (WebElement checkbox : checkboxes) {
            abc.add(checkbox.getText());
        }

       checkboxes.forEach(System.out::println);

     /*   for (WebElement w : checkboxes) {
            Assert.assertTrue(w.isSelected());
        }*/

    }
}
