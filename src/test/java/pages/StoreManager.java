package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoreManager {
    public StoreManager() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



























































    //Emre Soydemir 71-120
    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[2]/a")
    public WebElement storeManagerLink;
    @FindBy(xpath = "//*[@id=\"wcfm_menu\"]/div[5]/a/span[2]")
    public WebElement productsLink;

    @FindBy(xpath = "//*[@id=\"wcfm-products\"]/tbody/tr[1]/td[2]/a/img")
    public WebElement teaMakerProduit;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_attribute_head\"]/div")
    public WebElement attributesLink;
    @FindBy(id = "attributes_is_active_1")
    public WebElement colorCheckBox;
    @FindBy(xpath = "//*[@id=\"attributes\"]/div[2]/button[1]")
    public WebElement addColorButton;
    @FindBy(id = "attributes_is_active_2")
    public WebElement sizeCheckBox;
    @FindBy(xpath = "//*[@id=\"attributes\"]/div[3]/button[1]")
    public WebElement addSizeButton;
    @FindBy(xpath = "//*[@id=\"wcfm_products_manage_form_attribute_expander\"]/p[2]/button")
    public WebElement addAttributeButton;
    @FindBy(xpath = "//*[@id=\"attributes_name_3\"]")
    public WebElement addAttributeName;
    @FindBy(id = "wcfm_products_simple_submit_button")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@id=\"wcfm-products\"]/tbody/tr[1]/td[3]/a") public WebElement teaPotItem;

}
