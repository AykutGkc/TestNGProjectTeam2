package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MyAccount {

    public MyAccount(){
        PageFactory.initElements(Driver.getDriver(),this);
    }






























































































































































@FindBy(xpath = "(//*[@class='text-uppercase text-center mb-0'])[4]") public WebElement accountDetails;
@FindBy(xpath = "//button[@value='Save changes']") public WebElement saveChangesButton;

}
