package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class BookmarkPage extends BasePage {

    WebDriver driver;
    private String itemName = "";
    private String searchBar = "/html/body/div[1]/header/div[3]/form/span/input";
    private String searchBarInput = "//div/form/span/input";
    private String searchResultPage = "https://www.akakce.com/arama/?q=samsung";
    private CharSequence searchItemValue = "samsung";
    private String clickNextPage = "/html/body/div[2]/p[2]/a[2]";
    private String secondSearchResultPage = "https://www.akakce.com/arama/?q=samsung&p=2";
    private String itemNameLocator = "//li[3]/a/span[2]/h3";
    private String thirdTakipEtButton = "(//span[text()='Takip Et'])[3]";
    private String takipListemLocator = "//div/a[text()='Takip Listem']";
    private String itemLocatorOnTakipList = "//li[2]/a/span/h3";
    private String ucNoktaTakipListItem = "//li[2]/i[1]";
    private String takibiBirakButton = "(//span[text()='Takibi Bırak'])[3]";
    private String takibiBirakmaOnayi = "//div/div/button[2]";

    public BookmarkPage() {
        driver = Driver.getDriver();

    }
    public void searchSpecificItemAsWrittenToSearchbar() {
        driver.findElement(By.xpath(searchBar)).click();
        driver.findElement(By.xpath(searchBarInput)).sendKeys(searchItemValue , Keys.ENTER);
    }

    public void verifyThatSearchResultDisplayed() {
        String pageName = driver.getCurrentUrl();
        Assert.assertEquals(pageName, searchResultPage);
    }

    public void clickAndDisplaySecondPageOfSearchResults() {
        driver.findElement(By.xpath(clickNextPage)).click();
    }

    public void verifyThatSecondPageOfSearchResultsDisplayed() {
        String pageName = driver.getCurrentUrl();
        Assert.assertEquals(pageName, secondSearchResultPage);
    }

    public void addThirdItemToTakipEttiklerim() {
        itemName = driver.findElement(By.xpath(itemNameLocator)).getText();
        driver.findElement(By.xpath(thirdTakipEtButton)).click();
    }

    public void clickToTakipListem() {
        driver.findElement(By.xpath(takipListemLocator)).click();
    }

    public void verifyThatItemIsDisplayedOnTheTakipListemPage() {
        Assert.assertEquals(itemName, driver.findElement(By.xpath(itemLocatorOnTakipList)).getText() );
    }

    public void removeItemFormTakipEttiklerim() {
        driver.findElement(By.xpath(ucNoktaTakipListItem)).click();
        driver.findElement(By.xpath(takibiBirakButton)).click();
        driver.findElement(By.xpath(takibiBirakmaOnayi)).click();
    }

    public void verifyThatItemIsNotOnTheTakipEttiklerimList() {
        boolean sonuc = driver.findElement(By.cssSelector("div.empty-follow-list")).isDisplayed();
        Assert.assertEquals(sonuc, Boolean.TRUE);
    }
}
