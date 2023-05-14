package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccountMurat {
    public MyAccountMurat() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;
   // @FindBy(xpath = "//*[text()='Register']")
    //public WebElement Register;

    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement tikla;
    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOut;




    @FindBy(xpath = "//*[@href='https://pearlymarket.com/store-manager/']")
    public WebElement storeManager;

    @FindBy(xpath = "//*[text()='Products']")
    public WebElement products;

    @FindBy(xpath = "(//*[text()='Add New'])[1]")
    public WebElement addNew;

    @FindBy(id = "product_type")
    public WebElement pr0Type;

   // @FindBy(id = "product_type")
   // public WebElement proTpe;

   @FindBy(xpath = "//select[@class='wcfm-select wcfm_ele wcfm_product_type wcfm_full_ele simple variable external grouped booking']")
   public WebElement External_AffiliateProduct;
}
