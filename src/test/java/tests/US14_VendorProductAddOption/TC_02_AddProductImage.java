package tests.US14_VendorProductAddOption;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.StoreManager;

public class TC_02_AddProductImage extends VendorProductAddOptionWebBase{
    StoreManager storeManager;
    @Test
    public void AddProductImgage() {
        storeManager=new StoreManager();
        storeManager.imageAddFeld.click();
        storeManager.mediaLibraryItem.click();
        storeManager.chooseImage.click();
        storeManager.selectImageButton.click();
        Assert.assertTrue(storeManager.imgRemoveButton.isDisplayed());
    }
}
