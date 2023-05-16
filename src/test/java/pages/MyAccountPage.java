package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class MyAccountPage {
    public MyAccountPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Orders']" ) public WebElement orders;
    @FindBy(xpath = "//*[text()='My Account']" ) public WebElement myAccount;
    @FindBy(xpath = "//*[@class='woocommerce-Button button btn btn-link btn-underline btn-icon-right']" ) public WebElement browseProducts;
    @FindBy(xpath = "//*[@aria-label='Search']" ) public WebElement searchBox;
    @FindBy(xpath = "//*[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart']" ) public WebElement addtoCartSimgesi;




















































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























//RamazanBey
 @FindBy(xpath="(//*[text()='Sign In'])[1]") public WebElement signin;
    @FindBy(xpath="//input[@id='username']") public WebElement username;
 @FindBy(xpath="//input[@id='password']") public WebElement password;
 @FindBy(xpath="(//*[text()='Sign In'])[2]")public WebElement signinSubmit;
@FindBy(xpath = "//*[text()='Sign Out']")public WebElement signout;
 @FindBy(xpath ="//a[@href='https://pearlymarket.com/store-manager/']") public WebElement storeManeger;
  @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/products/']") public WebElement product;
 @FindBy(xpath ="//*[text()='Add New']") public WebElement addNew;
@FindBy(xpath="//div[@class='wcfm_product_manager_gallery_fields']") public WebElement invontery;
 @FindBy (xpath="//div[@id='wcfm_products_manage_form_shipping_head']") public WebElement shipping;
 @FindBy(xpath="//div[@id='wcfm_products_manage_form_attribute_head']") public WebElement attributtes;
@FindBy(xpath="//div[@id='wcfm_products_manage_form_linked_head']")public WebElement linked;
 @FindBy(xpath="//div[@id='wcfm_products_manage_form_yoast_head']") public WebElement seo;
 @FindBy(xpath="//div[@id='wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head']")public WebElement toptanUrunGosterme;
@FindBy(xpath="//div[@id='wcfm_products_manage_form_advanced_head']") public WebElement advanced;
@FindBy(xpath="//input[@id='sku']") public WebElement inventorySku;
 @FindBy (xpath = "//input[@id='manage_stock']")public WebElement manageStock;
@FindBy(xpath = "//input[@id='stock_qty']")public WebElement stockQty;
@FindBy(xpath="//select[@id='backorders']")public WebElement allowBackorders;
@FindBy(xpath="//select[@id='stock_status']") public WebElement stockstuckddm;
 @FindBy(xpath="//input[@id='sold_individually']") public WebElement soldindividually;
 @FindBy(xpath = "//input[@id='weight']") public WebElement weight;
@FindBy(xpath = "id=\"length\"")public WebElement length;
@FindBy(xpath = "//input[@id='length']") public WebElement width;
 @FindBy (xpath = "//input[@id='height']") public WebElement height;











    
    
    
    









    @FindBy(xpath = "(//*[@class='text-uppercase text-center mb-0'])[4]") public WebElement accountDetails;
    @FindBy(xpath = "//button[@name='save_account_details']") public WebElement saveChangesButton;




















































































































































    // Nihat G
    @FindBy(xpath = "//*[@class='login inline-type']") public WebElement signIn;
    @FindBy(xpath = "(//input[@id='username'])[1]") public WebElement signInEmail;
    @FindBy(xpath = "//*[@id='password']") public  WebElement signInPassword;
    @FindBy(xpath = "//button[@name='login']") public WebElement signInLogin;
    @FindBy(xpath = "//a[@class='login logout inline-type']")public WebElement signOut;
    @FindBy(xpath = "//a[text()='Addresses']") public WebElement address;
    @FindBy(xpath = "//*[text()='Billing address']") public WebElement billingAddress;
    @FindBy(xpath = "//*[text()='Shipping address']") public WebElement shippingAddress;
    @FindBy(xpath = "(//*[text()='Add'])[1]") public WebElement addBillingButon;
    @FindBy(xpath = "(//*[text()='Add'])[2]") public WebElement addShippingButon;
    @FindBy(xpath = "//input[@id='billing_first_name']") public WebElement firstName;
    @FindBy(xpath = "//*[@value='carl.tagen@fullangle.org']") public WebElement kayitliEmail;
    @FindBy(xpath = "(//a[@class='edit btn btn-link btn-primary btn-underline mb-4'])[1]") public WebElement editBillingButonu;
    @FindBy(xpath = "//*[text()='Edit Your Shipping Address']") public WebElement editShippingButon;
    @FindBy(xpath = "//a[text()='Logout']") public WebElement logout;
    @FindBy(xpath = "//button[text()='Save address']") public WebElement saweAddress;
    @FindBy(xpath = "//select[@id='billing_country']") public  WebElement dropdown;
    @FindBy(xpath = "//*[@id='billing_address_1']") public WebElement streetAdres;
    @FindBy(xpath = "(//select)[2]") public WebElement provinceDropdown;
    @FindBy(xpath = "//input[@id='billing_phone']") public WebElement phone;
    @FindBy(xpath = "//select[@value='TR']") public WebElement ulke;
    @FindBy(xpath = "//*[@id='email']") public WebElement fakaSiteEmail;























//Nihat G



//murat
@FindBy(xpath = "//*[text()='Register']")
public WebElement Register;
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn1;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement tikla;

    @FindBy(xpath = "//*[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManager;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement products;
    @FindBy(xpath = "//*[text()='Coupons']")// coupons kisminin locateri
    public WebElement Coupons;

    @FindBy(id = "title")
    public WebElement title;// kod yazma alani
    @FindBy(id = "description")
    public  WebElement descrption;//aciklama yazilan kisim
    @FindBy(id = "discount_type")
    public WebElement discount_type; //secim yeri
    @FindBy(id = "coupon_amount")
    public WebElement coupon_amount; // miktar girdigimizyer
    @FindBy(xpath = "//option[text()='Percentage discount']")
    public WebElement percentageDiscount;
    @FindBy(id = "expiry_date")
    public WebElement expiry_date; // tarihin yazildigi yer 2023-12-12
    @FindBy(xpath = "(//input[@type='submit'])[1]")
    public WebElement submit;// submit putonu

    @FindBy(id = "product_type")
    public WebElement pr0Type;
    // @FindBy(id = "product_type")
    // public WebElement proTpe;

    @FindBy(xpath = "//select[@class='wcfm-select wcfm_ele wcfm_product_type wcfm_full_ele simple variable external grouped booking']")
    public WebElement External_AffiliateProduct;























}
