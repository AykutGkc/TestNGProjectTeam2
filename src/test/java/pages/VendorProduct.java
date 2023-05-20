package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorProduct {

        public VendorProduct() {

            PageFactory.initElements(Driver.getDriver(), this);


        }

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
        @FindBy(xpath="(//div[@class='page_collapsible_content_holder'])[10]") public WebElement advanced;
        @FindBy(xpath="//input[@id='sku']") public WebElement inventorySku;
        @FindBy (xpath = "//input[@id='manage_stock']")public WebElement manageStock;
        @FindBy(xpath = "//input[@id='stock_qty']")public WebElement stockQty;
        @FindBy(xpath="//select[@id='backorders']")public WebElement allowBackorders;
        @FindBy(xpath="//select[@id='stock_status']") public WebElement stockstuckddm;
        @FindBy(xpath="//input[@id='sold_individually']") public WebElement soldindividually;

        @FindBy(xpath = "//input[@id='weight']")
        public WebElement weight;

        @FindBy(xpath = "//input[@id='length']")
        public WebElement length;

        @FindBy(xpath = "//input[@id='width']")
        public WebElement width;

        @FindBy(xpath = "//input[@id='height']")
        public WebElement height;

        @FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
        public WebElement color;

        @FindBy(xpath = "//input[@id='attributes_is_visible_1']")
        public WebElement visibleOnTheProductPage;

        @FindBy(xpath = "(//input[@class='select2-search__field'])[3]")
        public  WebElement size;

        @FindBy(xpath ="(//span[@class='select2-selection select2-selection--multiple'])[4]")
        public  WebElement upSells;

        @FindBy(xpath ="(//span[@class='select2-selection select2-selection--multiple'])[5]")
        public  WebElement croosSells;

        @FindBy(xpath = "//*[text()='No matching result found.']")
        public  WebElement minimun3karaktergirilmeli;

        @FindBy(xpath="//li[@class='select2-results__option select2-results__message']")
        public  WebElement  minimun3karaktergirilmeli2;

        @FindBy(xpath="//input[@id='yoast_wpseo_focuskw_text_input']")
        public WebElement enterafocuskeyword;
        @FindBy(xpath = "//textarea[@id='yoast_wpseo_metadesc']")
        public WebElement metadescription;

        @FindBy(xpath = "//select[@id='piecetype']")
        public  WebElement pieceTypeddm;

        @FindBy (xpath = "//input[@id='unitpercart']")
        public WebElement unitPerPiece;


        @FindBy (xpath = "//input[@id='minorderqtytr']")
        public WebElement minOrderQuantity;

        @FindBy (xpath="//input[@id='enable_reviews']")
        public WebElement enable;

        @FindBy (xpath="//input[@id='menu_order']")
        public WebElement menuOrder;

        @FindBy (xpath="//textarea[@id='purchase_note']")
        public WebElement purchaseNote;

        @FindBy(xpath = "//input[@id='attributes_is_active_1']")
        public WebElement colortik;

        @FindBy(xpath="//input[@id='attributes_is_active_2']")
        public WebElement size1;













    }

