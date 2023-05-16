package tests.US017_AddVariableProductAsAVender;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.StoreManager;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_AddVariableProductAsAVender {
    StoreManager storeManager=new StoreManager();
    MyAccountPage myAccount=new MyAccountPage();























































    @Test
    public void addVariableProductTest() throws InterruptedException {
       /*
        Kullanici https://pearlymarket.com/ sitesine kayitli olmalidir
        Kullanici Kayitli email bilgileri ile Login olur	lecorail242@gmail.com
        Kullanici Kayitli pasword bilgileri ile Login olur	corail123@
       */
        Driver.getDriver().get(ConfigReader.getProperty("pearlyMarket_Url"));
        myAccount.accountButton.click();
        myAccount.accountsignInButton.click();

        myAccount.usernameSignInInput.sendKeys(ConfigReader.getProperty("email"));
        myAccount.passwordSignInInput.sendKeys(ConfigReader.getProperty("password"));
        myAccount.signInloginButton.click();

        //Kullanici My account linkine tiklar
        Thread.sleep(8000);
        ReusableMethods.scrollEnd();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //                                                          doucmentten sonrasini Copy Js Path olarak koopyalayip yapistirilir
        WebElement text = (WebElement) js.executeScript("return document.querySelector(\"#menu-item-1079 > a\")");
        js.executeScript("arguments[0].click();", text); //Tiklamayi bu sekilde handle ederiz

        //Kullanici Store Manager secenegine tiklar
        storeManager.storeManagerLink.click();

        //Kullanici Products secenegine tiklar
        storeManager.productsLink.click();

        //Kullanici "Add New" butonuna tiklar
        storeManager.addNewProduct.click();

        //Kullanici "Variable Product" i secer
        storeManager.variablePruductDdm.click();

        //Kullanici US14 ve US15 Adimlarini takip ederek yen bir urun ekleme islemlerini yapmalidir
        //myAccount.virtualCheckbox.click();
        storeManager.productTitleBox.sendKeys("Camping Tent", Keys.ENTER);
      //  myAccount.priceBox.sendKeys("110" + Keys.ENTER);
       // myAccount.salePriceBox.sendKeys("100" + Keys.ENTER);
        storeManager.featuredImage.click();
        storeManager.featuredImageUploadButton.click();
        Thread.sleep(3000);
        storeManager.featuredImageSelect.click();
        storeManager.selectButton.click();
        storeManager.galleryImage.click();
    //    myAccount.mediaLibraryItem.click();
        storeManager.selectImageForGallery.click();
        storeManager.addToGalleryButton.click();
        storeManager.addToGalleryButton.click();
        storeManager.addCategoryName.sendKeys("Camping Accessories" + Keys.ENTER);
        Select select = new Select(storeManager.addParentCategory);
        select.selectByVisibleText("Sports");
        storeManager.addBrandLink.click();
        storeManager.addProductsBrandName.sendKeys("CampEmreProducts",Keys.ENTER);
        storeManager.addProductsButton.click();

        //Kullanici sayfanin altindaki secenekler bolumunden "Attributes" secenegine tiklar
        //Kullanici acilan bolumden "Color" kutusunu aktif hale getirir
        //Kullanici "Add New" butonuna tiklar
        //Kullanici urunun rengini girer	Bleu Ciel
        //Kullanici "Add New" butonuna tiklar
        //Kullanici urunun "Size" larini girer	S, M, L, XL
        //Kullanici "Activite" kutucuguna tiklar
        //Kullanici "Name" bolumune urunun ismini girer	Piknik semaveri
        //Kullanici Submit butonuna tiklar
        //Kullanici Sayfayi kapatir
    }
}
