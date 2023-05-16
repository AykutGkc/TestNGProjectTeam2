package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

    public class MyAccountRmzn {

        public MyAccountRmzn() {

            PageFactory.initElements(Driver.getDriver(), this);


        }

        @FindBy(xpath = "(//*[text()='Sign In'])[1]")
        public WebElement signin;
        @FindBy(xpath = "//input[@id='username']")
        public WebElement username;

        @FindBy(xpath = "//input[@id='password']")
        public WebElement password;

        @FindBy(xpath = "(//*[text()='Sign In'])[2]")
        public WebElement signinSubmit;

        @FindBy(xpath = "//*[text()='Sign Out']")
        public WebElement signout;

        @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/']")
        public WebElement storeManeger;

        @FindBy(xpath = "//a[@href='https://pearlymarket.com/store-manager/products/']")
        public WebElement product;

        @FindBy(xpath = "//*[text()='Add New']")
        public WebElement addNew;


        @FindBy(xpath = "//div[@class='wcfm_product_manager_gallery_fields']")
        public WebElement invontery;

        @FindBy(xpath = "//div[@id='wcfm_products_manage_form_shipping_head']")
        public WebElement shipping;

        @FindBy(xpath = "//div[@id='wcfm_products_manage_form_attribute_head']")
        public WebElement attributtes;

        @FindBy(xpath = "//div[@id='wcfm_products_manage_form_linked_head']")
        public WebElement linked;

        @FindBy(xpath = "//div[@id='wcfm_products_manage_form_yoast_head']")
        public WebElement seo;

        @FindBy(xpath = "//div[@id='wcfm_products_manage_form_toptan-urun-gosterme-ayarlari_head']")
        public WebElement toptanUrunGosterme;

        @FindBy(xpath = "//div[@id='wcfm_products_manage_form_advanced_head']")
        public WebElement advanced;

        @FindBy(xpath = "//input[@id='sku']")
        public WebElement inventorySku;

        @FindBy(xpath = "//input[@id='manage_stock']")
        public WebElement manageStock;

        @FindBy(xpath = "//input[@id='stock_qty']")
        public WebElement stockQty;

        @FindBy(xpath = "//select[@id='backorders']")
        public WebElement allowBackorders;

        @FindBy(xpath = "//select[@id='stock_status']")
        public WebElement stockstuckddm;

        @FindBy(xpath = "//input[@id='sold_individually']")
        public WebElement soldindividually;

        @FindBy(xpath = "//input[@id='weight']")
        public WebElement weight;

        @FindBy(xpath = "//input[@id=length']")
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

        @FindBy(xpath ="(//ul[@class='select2-selection__rendered'])[4]")
        public  WebElement upSells;

        @FindBy(xpath ="(//ul[@class='select2-selection__rendered'])[5]")
        public  WebElement croosSells;

        @FindBy(xpath = "//*[text()='No matching result found.']")
        public  WebElement minimun3karaktergirilmeli;

        @FindBy(xpath="//li[@class='select2-results__option select2-results__message']")
        public  WebElement  minimun3karaktergirilmeli2;






    }

