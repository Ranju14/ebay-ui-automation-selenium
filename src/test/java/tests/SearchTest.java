package tests;

import static constants.Constants.SEARCH_STRING;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.EbayHomePage;


public class SearchTest extends BaseTest{

    @Test(priority = 1, dataProvider = "searchString")
    public void verifySaveSearchLink(String searchProduct) {
        new EbayHomePage(driver).
        	verifyHomePage().
            searchProduct(searchProduct).
            saveSearch().
            verifySignInPage();         
    }

    @DataProvider
    private Object[][] searchString() {
        return new Object[][]{new Object[]{SEARCH_STRING}};
    }
       

}
