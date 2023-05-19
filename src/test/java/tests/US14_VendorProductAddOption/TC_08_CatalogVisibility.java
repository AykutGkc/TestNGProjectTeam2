package tests.US14_VendorProductAddOption;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;
import utilities.ReusableMethods;

public class TC_08_CatalogVisibility extends VendorProductAddOptionWebBase{
    StoreManager storeManager;
    @Test
    public void CatalogVisibility() {
        storeManager=new StoreManager();
        ReusableMethods.scroll(storeManager.CatalogVisibility);
        storeManager.CatalogVisibility.click();
        Select select1=new Select(storeManager.shopundeSearchResultsddm);
        Select select2=new Select(storeManager.ShopOnlyddm);
        Select select3=new Select(storeManager.SearchResultsOnlyddm);
        Select select4=new Select(storeManager.Hiddenddm);
        select1.selectByIndex(0);
        select1.selectByIndex(1);
        select1.selectByIndex(2);
        select1.selectByIndex(3);

        Assert.assertEquals("Shop and search results",select1.getFirstSelectedOption().getText());
        Assert.assertEquals("Shop only",select2.getFirstSelectedOption().getText());
        Assert.assertEquals("Search results only",select3.getFirstSelectedOption().getText());
        Assert.assertEquals("Hidden",select4.getFirstSelectedOption().getText());

    }
}
