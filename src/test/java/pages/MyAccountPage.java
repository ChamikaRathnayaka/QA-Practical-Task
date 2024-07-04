package pages;

import dev.failsafe.Timeout;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyAccountPage {
    WebDriver driver=null;
    WebDriverWait wait;

    By search_bar= By.id("edit-search");
    By search_icon=By.className("search-icon");
    By no_result_text=By.xpath("//strong[contains(text(),'Sorry, no products available!')]");
    By add_cart_icon=By.xpath("//body/div[3]/main[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/a[1]/img[1]");
    By cart_icon=By.xpath("//header/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]");
    By product_card=By.xpath("//body/div[3]/main[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]");
    By HomeButton= By.xpath("//a[contains(text(),'Home /')]");


    public MyAccountPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void TextInSearchBar(String text){
        driver.findElement(search_bar).sendKeys(text);
    }
    public void ClickSearchButton(){driver.findElement(search_icon).click();}
    public void ClickProductCard(){driver.findElement(product_card).click();}

    public void ClickAddCartIcon(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_cart_icon));
        driver.findElement(add_cart_icon).click();
    }

    public void ClickCartIcon(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(cart_icon).click();
    }

    public void ClickHomeButton(){
        driver.findElement(HomeButton).click();
    }

    public void CheckNoResult() {
        try {
            WebElement noResults = driver.findElement(no_result_text);
            if (noResults.isDisplayed()) {
                System.out.println("Search term resulted in 'Sorry, no products available!' message as expected.");
            } else {
                System.out.println("Search term resulted in unexpected results.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("No 'No results found' message found. Expected behavior for an invalid search term.");
        }
    }

}
