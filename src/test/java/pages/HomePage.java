package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
@FindBy(css = "*[class='login inline-type'] ") public WebElement register;
    @FindBy(xpath = "//*[@href='signup']" ) public WebElement signup;
    @FindBy(xpath = "//*[@id='reg_username']" ) public WebElement username;
    @FindBy(xpath = "//*[@type='email']" ) public WebElement email;
    @FindBy(xpath = "//*[@id='reg_password']" ) public WebElement password;
    @FindBy(xpath = "//*[@for='register-policy']" ) public WebElement iAgree;
    @FindBy(xpath = "//*[@value='Sign Up']" ) public WebElement signupButon;
    @FindBy(xpath = "//*[text()='An account is already registered with your email address. ']" ) public WebElement alreadyRegister;






















































































































































@FindBy(xpath = "//span[text()='Sign In']") public WebElement signIn;
@FindBy(xpath = "//a[text()='My Account']") public WebElement myAccount;
@FindBy(xpath = "//input[@id='username']") public WebElement usernameOrEmailAddressKutusu;
    @FindBy(xpath = "//input[@id='username']") public WebElement usernameOrEmailAddressKutusu22;
    







}
