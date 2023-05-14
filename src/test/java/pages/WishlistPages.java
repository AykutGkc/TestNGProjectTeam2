package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WishlistPages {
    public WishlistPages() { PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='w-icon-heart']" ) public WebElement wishlistKalp;
    @FindBy(xpath = "//*[@class='w-icon-heart']" ) public WebElement erkekAyakkabı;
    @FindBy(xpath = "//*[@title='Quick View']" ) public WebElement quickView;
    @FindBy(xpath = "//*[@class='product-meta-inner']" ) public WebElement urunAyrıntı;
    @FindBy(xpath = "//*[text()='In Stock']" ) public WebElement inStock;
    @FindBy(xpath = "//*[@data-product_id='14070']" ) public WebElement addToChart;

}