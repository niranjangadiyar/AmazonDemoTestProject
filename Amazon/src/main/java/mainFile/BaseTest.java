package mainFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.*;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;
    public FileInputStream br;
    public Properties property;

    @BeforeClass
    public void configureDriver()
    {
        try {
            br = new FileInputStream("src/main/resources/testData.properties");
            property=new Properties();
                try{
                    property.load(br);
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            String link = property.getProperty("url");
            driver.get(link);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void quitDriver()
    {
        driver.quit();
    }
}
