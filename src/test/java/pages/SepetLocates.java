package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SepetLocates {






















































































































































































































    //221-270 sevil
    @FindBy(xpath = "(//input[@type='search'])[1]") public WebElement search;
    @FindBy(xpath = "//button[@name='add-to-cart']")public WebElement addcartbutton;
    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]") public WebElement sepet;
    @FindBy  (xpath = "//span[text()='Kitchen Table']" ) public WebElement KitchenTableText;
    @FindBy  (xpath = " //a[@class='button wc-forward']") public WebElement viewcartbutton;
    @FindBy  (xpath = " //button[@title='Plus']")  public WebElement plusbutton;
    @FindBy  (xpath = " //button[@title='Minus']") public WebElement minusbutton;
    @FindBy  (xpath = "//button[@value='Update cart'] ") public WebElement updatebutton;
    @FindBy  (xpath = " //span[@class='quantity']") public WebElement yeniürünsayisicarpifiyat1;

    @FindBy  (xpath = "  (//span[@role='textbox'])[1]") public WebElement Ülkebutonu;

    @FindBy  (xpath = "  (//span[@role='textbox'])[2]")  public WebElement sehirbutonu;
    @FindBy  (xpath = " //a[@class='checkout-button button alt wc-forward'] ") public WebElement proceedtocheckout;
    @FindBy  (xpath = "//input[@name='billing_first_name']")  public WebElement firstname;
    @FindBy  (xpath = "//body/div/main/div/div/div/div/div/form/div/div/div/div/div/p/span/select")
    public WebElement ddm;
    @FindBy  (xpath = "(//select)[2]")public WebElement ddm2;
    @FindBy  (xpath = "//input[@id='billing_address_1']") public WebElement streetadress;
    @FindBy  (xpath = "//input[@id='billing_city']") public WebElement town;
    @FindBy  (xpath = "//input[@id='billing_postcode']")  public WebElement zipcode;
    @FindBy  (xpath = "//input[@id='billing_phone']") public WebElement phone;
    @FindBy  (xpath = "//input[@id='billing_email']")  public WebElement mail;
    @FindBy  (xpath = "//button[@id='place_order']")   public WebElement placeorder;














//221-270 sevil

}
