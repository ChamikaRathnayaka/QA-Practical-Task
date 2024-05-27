package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    By increase_count_icon=By.xpath("//span[contains(text(),'+')]");
    By ok_button=By.xpath("//body[1]/div[3]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]");
    By remove_icon=By.id("edit-remove-button-0");
    By place_order_button=By.id("place-order");

    public CartPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void IncreaseProductCount(){driver.findElement(increase_count_icon).click();}
    public void confirmIncrease(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(ok_button));
        driver.findElement(ok_button).click();
    }
    public void RemoveItemFromCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove_icon));
        driver.findElement(remove_icon).sendKeys(Keys.RETURN);
    }

    public void ClickPlaceOrderButton(){driver.findElement(place_order_button).sendKeys(Keys.RETURN);}
}

