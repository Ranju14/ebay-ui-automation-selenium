package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import static constants.Constants.EBAY_HOMEPAGE_URL;
import static constants.Constants.WEB_DRIVER_WAIT_DURATION;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void setup() {
    	//please change the path here to /path/gecko-driver
        System.setProperty("webdriver.gecko.driver", "path to geckodriver");

        FirefoxOptions opt = new FirefoxOptions();
        driver = new FirefoxDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(WEB_DRIVER_WAIT_DURATION, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void enterURL() {
        driver.get(EBAY_HOMEPAGE_URL);
    }

    @AfterSuite
    public void teardown() {
        driver.quit();
    }
}
