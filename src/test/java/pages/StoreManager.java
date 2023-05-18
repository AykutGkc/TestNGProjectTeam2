package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoreManager {
    public StoreManager() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



























































    //Emre Soydemir 71-120
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[2]/a")    public WebElement storeManagerLink;
    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[5]/a/span[2]")  public WebElement productsLink;
    @FindBy(id = "add_new_product_dashboard") public WebElement addNewProduct;
    @FindBy(xpath = "//*[@id=\"product_type\"]/option[2]") public WebElement variablePruductDdm;
    @FindBy(id = "is_virtual") public WebElement virtualCheckbox;
    @FindBy(id="pro_title") public WebElement productTitleBox;
    @FindBy(id = "regular_price") public WebElement priceBox;
    @FindBy(id = "sale_price") public WebElement salePriceBox;
    @FindBy(id = "featured_img_display") public WebElement featuredImage;
    @FindBy(id = "menu-item-browse") public WebElement featuredImageUploadButton;
    @FindBy(xpath = "//*[@id=\"__attachments-view-54\"]/li[2]") public WebElement featuredImageSelect;
    @FindBy(xpath = "//*[@id=\"__wp-uploader-id-0\"]/div[4]/div/div[2]/button") public WebElement selectButton;
    @FindBy(id = "gallery_img_gimage_0_display") public WebElement galleryImage;
    @FindBy(xpath = "//*[@id=\"menu-item-browse\"]") public WebElement mediaLibraryItem;
    @FindBy(xpath = "//*[@id=\"__attachments-view-124\"]/li[2]") public WebElement selectImageForGallery;
    @FindBy(xpath = "//*[@id=\"__wp-uploader-id-3\"]/div[4]/div/div[2]/button") public WebElement addToGalleryButton;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_general_expander\"]/div[2]/div[5]") public WebElement addCategoryButton;
    @FindBy(id = "wcfm_new_cat") public WebElement addCategoryName;
    @FindBy(xpath = "//*[@id=\"wcfm_new_parent_cat\"]/option[124]") public WebElement addParentCategory;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_general_expander\"]/div[2]/div[10]/p") public WebElement addBrandLink;
    @FindBy(id = "wcfm_new_product_brand") public WebElement addProductsBrandName;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_general_expander\"]/div[2]/div[10]/div/button") public WebElement addProductsButton;













































































    @FindBy (id = "product_type") public WebElement ddmMenüProducktType;
    @FindBy (id = "featured_img_display") public WebElement imageAddFeld;
    @FindBy (xpath = "(//div[@class='thumbnail'])[1]") public WebElement chooseImage;
    @FindBy (xpath = "//button[@class='button media-button button-primary button-large media-button-select']") public WebElement selectImageButton;
    @FindBy (id= "featured_img_remove_button") public WebElement imgRemoveButton;
    @FindBy (xpath = "//*[text()='Shipping']") public WebElement shippingButton;
    @FindBy (id = "//input[@id='weight']") public WebElement weightBox;
    @FindBy (id = "//input[@id='length']") public WebElement lengthBox;
    @FindBy (id = "//input[@id='width']") public WebElement widthBox;
    @FindBy (id = "//input[@id='height']") public WebElement heightBox;
    @FindBy (xpath = "//input[@class='wcfm-checkbox checklist_type_product_cat wcfm_validation_success']") public WebElement allCatogoriesCheckBox;
    @FindBy (xpath = "(//span[@class='required'])[1]") public WebElement categoriesText;








}
