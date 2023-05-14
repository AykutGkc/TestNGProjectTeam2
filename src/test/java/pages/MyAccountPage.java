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









}
