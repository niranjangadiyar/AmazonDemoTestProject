package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchResultsScreen {

    WebDriver driver;

    public SearchResultsScreen(WebDriver driver)
    {
        this.driver=driver;
    }

    //locator for first product name in the search results
    By searchedProductName= By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]");

    //Verify if the search result consists of "iPhone"
    public void verifySearchResult(String text)
    {
        String firstProduct = driver.findElement(searchedProductName).getText();
        Boolean value = firstProduct.contains(text);
        Assert.assertTrue(value);
    }
}
