package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homescreen {

    WebDriver driver;

    public Homescreen(WebDriver driver)
    {
        this.driver=driver;
    }

    //locator for search box
    By searchBox=By.xpath("//*[@id='twotabsearchtextbox']");

    //locator for search button
    By searchBtn=By.xpath("//*[@id='nav-search-submit-button']");

    //method for entering value in search field.
    public void enterInSearchField(String text)
    {
        driver.findElement(searchBox).sendKeys(text);
    }

    //method for clicking on search button
    public void clickSearchBtn()
    {
        driver.findElement(searchBtn).click();
    }
}
