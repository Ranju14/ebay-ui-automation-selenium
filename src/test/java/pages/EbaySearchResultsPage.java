package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EbaySearchResultsPage extends BasePage{
	
	@FindBy(className = "srp-controls__count-heading")
    WebElement searchHeading;
	    
    @FindBy(xpath = "//span[contains(text(),'Save this search')]")
    WebElement saveSearchLink;
	
	public EbaySearchResultsPage(WebDriver driver) {
        super(driver);
    }
    
	public EbaySignInPage saveSearch() {
		wait.until(ExpectedConditions.visibilityOf(saveSearchLink));
		saveSearchLink.click();
		return new EbaySignInPage(driver);
	}

}
