package stepDefinitions;

import io.cucumber.java.en.And;
import PageObjectModel.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage = new LoginPage();
    @And("Click Giris Yap Link")
    public void clickGirisYapLink() {
        loginPage.clickGirisYapLink();

    }

    @And("Enter email address and password")
    public void enterEmailAddressAndPassword() {
        loginPage.enterEmailAddressAndPassword();
    }

    @And("Click Giris Yap button")
    public void clickGirisYapButton() {
        loginPage.clickGirisYapButton();
    }
}
