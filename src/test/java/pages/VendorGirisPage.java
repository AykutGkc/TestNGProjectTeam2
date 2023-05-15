package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class VendorGirisPage {
    public VendorGirisPage() { PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='w-icon-account']" ) public WebElement vendorsignin;
    @FindBy(xpath = "//*[@id='username']" ) public WebElement vendorusername;

    @FindBy(xpath = "//*[@id='password']" ) public WebElement vendorpassword;
    @FindBy(xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']" ) public WebElement vendorsigninbutonu;
    @FindBy(xpath = "//*[@class='form-control']" ) public WebElement vendorsearchbox;
    @FindBy(xpath = "//*[@class='cart-toggle']" ) public WebElement vendorcart;

    @FindBy(xpath = "(//*[@class='woocommerce-Price-amount amount'])[5]" ) public WebElement vendortotal;
    @FindBy(xpath = "//*[@class='input-text form-control mr-0 mr-sm-1 mb-4 mb-sm-0']" ) public WebElement vendorentercodplace;

    @FindBy(xpath = "//*[@class='btn button btn-rounded btn-default']" ) public WebElement vendorapplycoupon;
    @FindBy(xpath = "//*[@class='woocommerce-order-details']" ) public WebElement vendororderdetail;
}
