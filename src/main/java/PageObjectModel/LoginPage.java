package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {

    WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
    }

    public void clickGirisYapLink() {
        driver.findElement(By.cssSelector("header  div > a:nth-child(2)")).click();
    }

    public void enterEmailAddressAndPassword() {
        driver.findElement(By.xpath("(//*[@type=\"email\"])[2]")).sendKeys("r514q.test@inbox.testmail.app");
        driver.findElement(By.xpath("(//*[@type=\"password\"])[1]")).sendKeys("M4ae$GrhXZ+hLQS");

    }

    public void clickGirisYapButton() {
        driver.findElement(By.xpath("(//*[@value=\"Giriş yap\"])[1]")).click();

    }


}
