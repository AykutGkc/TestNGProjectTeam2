package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MyAccountPage {
    public MyAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


























































    //Emre soydemir 71-120
    @FindBy(xpath = "//div[@class='account']")    public WebElement accountButton;
    @FindBy(xpath = "//a[@href='signup']")    public WebElement signUpButton;
    @FindBy(xpath = "//a[@href='signin']")    public WebElement accountsignInButton;
     @FindBy(xpath = "//button[@name='login']")  public WebElement signInloginButton;
    @FindBy(id = "username")    public WebElement usernameSignInInput;
    @FindBy(id = "password")    public WebElement passwordSignInInput;
    @FindBy(xpath = "//button[@name='login']")    public WebElement signInButton;
    @FindBy(xpath = "(//div[@class='icon-box text-center'])[3]")    public WebElement adressLink;
    @FindBy(id = "billing_first_name")    public WebElement addFirstName;
    @FindBy(id = "billing_last_name")    public WebElement addLastName;
    @FindBy(id = "billing_country")    public WebElement selectBillingCountyrDdm;
    @FindBy(id = "billing_address_1")    public WebElement addBillingAddress;
    @FindBy(id = "billing_city")    public WebElement addBillingCity;
    @FindBy(id = "billing_state")    public WebElement addBillingState;
    @FindBy(id = "billing_postcode")    public WebElement addBillingPostcode;
    @FindBy(id = "billing_phone")    public WebElement addBillingPhone;
    @FindBy(id = "billing_email")    public WebElement addBillingEmail;
    @FindBy(css = "#main > div > div > div > div > div > div > div > form > div > p > button")    public WebElement saveAddressButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[1]")    public WebElement savedBillingAddressAllert;
    @FindBy(id = "shipping_first_name") public WebElement addShippingFirstName;
    @FindBy(id = "shipping_last_name") public WebElement addShippingLastName;
    @FindBy(id = "shipping_country")    public WebElement selectShippingCountyrDdm;
    @FindBy(id = "shipping_address_1")    public WebElement addShippingAddress;
    @FindBy(id = "shipping_city")    public WebElement addShippingCity;
    @FindBy(id = "shipping_postcode")    public WebElement addShippingPostcode;
    @FindBy(id = "shipping_email")    public WebElement addShippingEmail;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[1]/div")    public WebElement savedshippingAddressAllert;
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











}
