package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static constants.Constants.EBAY_HOMEPAGE_URL;
import static org.testng.Assert.assertEquals;

public class EbayHomePage extends BasePage {

    @FindBy(id = "gh-l-h1")
    WebElement heading;

    @FindBy(id = "gh-ac")
    WebElement searchBar;

    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    public EbayHomePage verifyHomePage() {
        wait.until(ExpectedConditions.visibilityOf(heading));
        assertEquals(driver.getCurrentUrl(), EBAY_HOMEPAGE_URL);
        return this;
    }
    
	public EbaySearchResultsPage searchProduct(String searchProduct) {
		searchBar.click();
		searchBar.sendKeys(searchProduct);
		searchBar.sendKeys(Keys.ENTER);
		return new EbaySearchResultsPage(driver);
	}

}

