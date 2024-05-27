package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver = null;
    WebDriverWait wait;

    By login_button = By.className("login-link");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void loginButtonClick(){driver.findElement(login_button).sendKeys(Keys.RETURN);}
}
