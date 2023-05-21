package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoreManager {
    public StoreManager() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



























































    //Emre Soydemir 71-120
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[2]/a")
    public WebElement storeManagerLink;
    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[5]/a/span[2]")
    public WebElement productsLink;

    @FindBy(xpath = "//*[@id=\"wcfm-products\"]/tbody/tr[1]/td[2]/a/img")
    public WebElement teaMakerProduit;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_attribute_head\"]/div")
    public WebElement attributesLink;
    @FindBy(id = "attributes_is_active_1")
    public WebElement colorCheckBox;
    @FindBy(xpath = "//*[@id=\"attributes\"]/div[2]/button[1]")
    public WebElement addColorButton;
    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeCheckBox;
    @FindBy(xpath = "//*[@id=\"attributes\"]/div[3]/button[1]")
    public WebElement addSizeButton;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_attribute_expander\"]/p[2]/button")
    public WebElement addAttributeButton;
    @FindBy(xpath = "//*[@id=\"attributes_name_3\"]")
    public WebElement addAttributeName;
    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"wcfm-products\"]/tbody/tr[1]/td[3]/a") public WebElement teaPotItem;











































































    @FindBy (id = "product_type") public WebElement ddmMenüProducktType;
    @FindBy (id = "featured_img_display") public WebElement imageAddFeld;
    @FindBy (xpath = "(//div[@class='thumbnail'])[1]") public WebElement chooseImage;
    @FindBy (xpath = "//button[@class='button media-button button-primary button-large media-button-select']") public WebElement selectImageButton;
    @FindBy (id= "featured_img_remove_button") public WebElement imgRemoveButton;
    @FindBy (id = "wcfm_products_manage_form_shipping_head") public WebElement shippingButton;
    @FindBy (xpath = "//input[@id='weight']") public WebElement weightBox;
    @FindBy (xpath = "//input[@class='wcfm-checkbox checklist_type_product_cat wcfm_validation_success']") public WebElement allCatogoriesCheckBox;
    @FindBy (xpath = "(//span[@class='required'])[1]") public WebElement categoriesText;
    @FindBy (xpath = "//select[@id='shipping_class']") public WebElement shippingClass;
    @FindBy (xpath = "//p[text()='+Add new category']") public WebElement addNewCategoriesButton;
    @FindBy (id = "wcfm_new_cat") public WebElement categoryNameBox;
    @FindBy (xpath = "//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt']") public WebElement addButtonCategories;
    @FindBy (xpath = "//p[text()='+Add new Product brands']") public WebElement addNewBrandsButton;
    @FindBy (id = "wcfm_new_product_brand") public WebElement brandsNameBox;
    @FindBy (xpath = "//button[@class='button wcfm_add_category_bt wcfm_add_taxonomy_bt']") public WebElement addButtonBrands;
    @FindBy (xpath = "//textarea[@id='product_tags']") public WebElement tagsBox;
    @FindBy (xpath = "//select[@id='catalog_visibility']") public WebElement CatalogVisibility;
    @FindBy (xpath = "//*[text()='Shop and search results']") public WebElement shopundeSearchResultsddm;
    @FindBy (xpath = "//*[text()='Shop only']") public WebElement ShopOnlyddm;
    @FindBy (xpath = "//*[text()='Search results only']") public WebElement SearchResultsOnlyddm;
    @FindBy (xpath = "//*[text()='Hidden']") public WebElement Hiddenddm;
    @FindBy(xpath = "//*[@id=\"menu-item-browse\"]") public WebElement mediaLibraryItem;
    @FindBy(id = "tinymce") public WebElement description;
    @FindBy(id = "pro_title") public WebElement productTitle;
    @FindBy(xpath = "//*[@id=\"tinymce\"]/p") public WebElement textShortDescription;
    @FindBy(xpath = "//*[@id=\"tinymce\"]/p") public WebElement textDescription;




















}
