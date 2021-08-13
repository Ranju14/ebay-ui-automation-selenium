package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constants.WEB_DRIVER_WAIT_DURATION;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, WEB_DRIVER_WAIT_DURATION);
        PageFactory.initElements(driver, this);
    }
}