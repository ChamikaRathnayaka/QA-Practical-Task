package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingleProductPage {
    WebDriver driver;
    WebDriverWait wait;
    By single_addto_cart = By.id("edit-order-now");
    By check_offers_button=By.xpath("//body/div[6]/main[1]/div[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[8]/a[1]");
    By hsbc=By.xpath("//body/div[6]/main[1]/div[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/img[1]");
    By boc=By.xpath("//body/div[6]/main[1]/div[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/img[1]");
    By hnb=By.xpath("//body/div[6]/main[1]/div[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/img[1]");
    By commercial=By.xpath("//body/div[6]/main[1]/div[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]/img[1]");
    By peoples=By.xpath("//body/div[6]/main[1]/div[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[8]/div[1]/div[1]/div[1]/ul[1]/li[6]/a[1]/img[1]");
    By close_popup_button=By.xpath("//body/div[6]/main[1]/div[1]/div[1]/div[2]/article[1]/div[1]/div[2]/div[8]/div[1]/h2[1]/span[1]");
    public SingleProductPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void ClickSingleAddToCartButton(){driver.findElement(single_addto_cart).sendKeys(Keys.RETURN);}
    public void CheckOffersButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(check_offers_button));
        driver.findElement(check_offers_button).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(2000);
    }
    public void CheckAllBankOffers() throws InterruptedException {
        driver.findElement(hsbc).click();
        Thread.sleep(1000);
        driver.findElement(boc).click();
        Thread.sleep(1000);
        driver.findElement(hnb).click();
        Thread.sleep(1000);
        driver.findElement(commercial).click();
        Thread.sleep(1000);
        driver.findElement(peoples).click();
        Thread.sleep(1000);
    }


}
