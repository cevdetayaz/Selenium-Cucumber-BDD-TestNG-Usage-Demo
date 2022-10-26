package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import PageObjectModel.MainPage;
import org.openqa.selenium.WebDriver;

public class MainPageSteps {
    WebDriver driver;
    MainPage mainPage = new MainPage();

    @Given("Navigate to Web Site")
    public void navigateToWebSite() {
        mainPage.navigateToWebSite();
    }

    @Then("Verify that home page is displayed successfully")
    public void verifyThatHomePageIsDisplayedSuccessfully() {
        mainPage.verifyThatHomePageIsDisplayedSuccessfully();
    }
}
