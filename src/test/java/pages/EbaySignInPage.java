package pages;

import static constants.Constants.SIGNIN_MESSAGE;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EbaySignInPage extends BasePage{
	

	@FindBy(id= "signin-reg-msg")
    WebElement signInHeading;

	public EbaySignInPage(WebDriver driver) {
		super(driver);
	}
	
	public EbaySignInPage verifySignInPage() {
		wait.until(ExpectedConditions.visibilityOf(signInHeading));
		assertEquals(signInHeading.getText(),SIGNIN_MESSAGE);
		return this;
	}

}
