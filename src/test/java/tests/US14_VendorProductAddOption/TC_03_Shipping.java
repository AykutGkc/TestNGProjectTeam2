package tests.US14_VendorProductAddOption;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class TC_03_Shipping extends VendorProductAddOptionWebBase{
    StoreManager storeManager;


    @Test
    public void shipping() {
        storeManager=new StoreManager();
        Actions actions=new Actions(Driver.getDriver());//Action Objesi tiklanir
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();//Sayfanin asagina gidilir
        storeManager.shippingButton.click();
        storeManager.weightBox.sendKeys(ConfigReader.getProperty("WeightforShipping"), Keys.TAB,
                                ConfigReader.getProperty("LengthforShipping"),Keys.TAB,
                                ConfigReader.getProperty("WidthforShipping"), Keys.TAB,
                                ConfigReader.getProperty("HeightforShipping"));

        WebElement allShippingOption= storeManager.shippingClass;
        Select select=new Select(allShippingOption);
        List<WebElement> allOptionList=select.getOptions();
        for (WebElement webElement : allOptionList) {
            System.out.println(allShippingOption.getText());
        }
        int expectedResult=3;
        Assert.assertEquals(allShippingOption.getSize(),expectedResult);



    }
}
