package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class MainPage extends BasePage {

    WebDriver driver;
    String nav_to_mainpage = "https://www.akakce.com/";

    public MainPage() {
        driver = Driver.getDriver();
    }
    public void navigateToWebSite() {
        driver.get(nav_to_mainpage);
        driver.manage().window().maximize();

    }

    public void verifyThatHomePageIsDisplayedSuccessfully() {
        String siteName = driver.getCurrentUrl();
        checkUrl(siteName, nav_to_mainpage);
    }

    private void checkUrl(String siteName, String s) {
        Assert.assertEquals(siteName, s);
    }
}
