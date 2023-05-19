package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ShoppingCartPages {
    public ShoppingCartPages() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='button wc-forward']" ) public WebElement viewCart;
    @FindBy(xpath = "//*[@class='button checkout wc-forward']" ) public WebElement checkout;
    @FindBy(xpath = "//*[@class='woocommerce-billing-fields']" ) public WebElement billingDetails;
    @FindBy(xpath = "//*[@class='woocommerce-checkout-payment']" ) public WebElement paymentMethods;
    @FindBy(xpath = "(//*[@class='input-radio'])[2]" ) public WebElement payatthedoor;
    @FindBy(xpath = "//*[@name='woocommerce_checkout_place_order']" ) public WebElement placeorder;

    @FindBy(xpath = "//*[@id='quantity_646742ad335a6']" ) public WebElement artırmaazaltma;
}
