package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver(new EdgeOptions().addArguments("--remote-allow-origins=*"));
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                default:
                    driver = new ChromeDriver();
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {//Driver'a değer atanmışşsa
            driver.close();
            driver = null;
        } 
    }

    public static void quitDriver() {
        if (driver != null) { //Driver'A deger atanmissa
            driver.quit();
            driver = null;
        }

    }


}
