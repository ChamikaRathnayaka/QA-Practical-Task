package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    By email = By.id("email");
    By password = By.id("password");
    By loginButton = By.id("login-submit");
    By LogOutButtonLocator=By.xpath("//header/div[2]/div[1]/div[3]/nav[1]/ul[1]/li[3]/a[1]");
    By invalidCredintials=By.xpath("//div[contains(text(),'Invalid email or password')]");
    By invalid_ok=By.xpath("//body/div[3]/div[4]/div[1]/div[3]/a[1]");
    public LoginPage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public boolean isMyAccountPageLoaded(){return wait.until(ExpectedConditions.visibilityOfElementLocated(LogOutButtonLocator)).isDisplayed();}
    public boolean InvalidCredentials(){return wait.until(ExpectedConditions.visibilityOfElementLocated(invalidCredintials)).isDisplayed();}
    public void ClickInvalidOk(){driver.findElement(invalid_ok).sendKeys(Keys.RETURN);}
    public void TextInEmail(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).isDisplayed();
        driver.findElement(email).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(email).sendKeys(text);}
    public void CodeInPassword(String text){driver.findElement(password).sendKeys(text);}
    public void LoginButtonClick(){driver.findElement(loginButton).sendKeys(Keys.RETURN);}
}
