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



























}
