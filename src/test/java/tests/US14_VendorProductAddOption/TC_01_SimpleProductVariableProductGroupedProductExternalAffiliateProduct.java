package tests.US14_VendorProductAddOption;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.List;

public class TC_01_SimpleProductVariableProductGroupedProductExternalAffiliateProduct extends VendorProductAddOptionWebBase{

    StoreManager storeManager;
    MyAccountPage myAccountPage;
    @Test
    public void ProductTypeTest() {

        storeManager=new StoreManager();
        myAccountPage=new MyAccountPage();
        Select select=new Select(storeManager.ddmMenüProducktType);

        List<WebElement> ddmMenüProducktTypeList=select.getOptions();
        for (WebElement w: ddmMenüProducktTypeList) {
            if (w.getText()== ConfigReader.getProperty("ddmSimpleProduckt")){
                Assert.assertTrue(true);
                break;
            } else if (w.getText()==ConfigReader.getProperty("ddmVariableProduct")) {
               Assert.assertTrue(true);
                break;
            } else if (w.getText()==ConfigReader.getProperty("ddmGroupedProduct")) {
                Assert.assertTrue(true);
                break;
            } else if (w.getText()==ConfigReader.getProperty("ddmExternal/AffiliateProduct")) {
                Assert.assertTrue(true);
                break;
            }else {
                Assert.assertFalse(false);
                break;
            }
        }



    }
}
