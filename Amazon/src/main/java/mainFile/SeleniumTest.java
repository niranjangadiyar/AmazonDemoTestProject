package mainFile;

import org.testng.annotations.Test;
import pages.Homescreen;
import pages.SearchResultsScreen;



public class SeleniumTest extends BaseTest{

    @Test
    public void testCase()
    {
        Homescreen homescreen = new Homescreen(driver);
        SearchResultsScreen searchResultsScreen = new SearchResultsScreen(driver);

        homescreen.enterInSearchField("Apple iPhone");
        homescreen.clickSearchBtn();

        searchResultsScreen.verifySearchResult("iPhone");

    }
}
