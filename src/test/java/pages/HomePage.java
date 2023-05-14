package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

















































































































































































































  //221-270 sevil
   @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement search;

    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addcartbutton;

    @FindBy(xpath = "(//i[@class='w-icon-cart'])[1]")
    public WebElement sepet;


    @FindBy  (xpath = "//span[text()='Kitchen Table']" )
    public WebElement KitchenTableText;

    @FindBy  (xpath = " //a[@class='button wc-forward']")
            public WebElement viewcartbutton;


    @FindBy  (xpath = " //button[@title='Plus']")
    public WebElement plusbutton;


    @FindBy  (xpath = " //button[@title='Minus']")
    public WebElement minusbutton;

    @FindBy  (xpath = "//button[@value='Update cart'] ")
    public WebElement updatebutton;

    @FindBy  (xpath = " //span[@class='quantity']")
    public WebElement yeniürünsayisicarpifiyat1;

    @FindBy  (xpath = "  (//span[@role='textbox'])[1]")
    public WebElement Ülkebutonu;

    @FindBy  (xpath = "  (//span[@role='textbox'])[2]")
    public WebElement sehirbutonu;





















//221-270 sevil
























}
