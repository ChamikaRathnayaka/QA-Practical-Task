package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver = null;
    WebDriverWait wait;

    By login_button = By.className("login-link");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void loginButtonClick() {wait.until(ExpectedConditions.visibilityOfElementLocated(login_button)).sendKeys(Keys.RETURN);}
}
