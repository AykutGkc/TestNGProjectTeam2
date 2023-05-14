package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductsPages {
    public ProductsPages() { PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[11]" ) public WebElement ayakkabı;
    @FindBy(xpath = "(//*[@rel='nofollow'])[14]" ) public WebElement begen;
}
