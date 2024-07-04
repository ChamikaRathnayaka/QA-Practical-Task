package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HeaderBar {
    WebDriver driver;
    WebDriverWait wait;

    By product= By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[1]");
    By brands=By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]");
    By dutyfree=By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]");
    By ominicart=By.xpath("//a[contains(text(),'Omni Cart')]");
    By hotdeals=By.xpath("//a[contains(text(),'\uD83D\uDD25 Hot Deals')]");
    By loyalatyProgram=By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/a[1]");


    public HeaderBar(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void productPage(){driver.findElement(product).click();}
    public void brandsPage(){driver.findElement(brands).click();}
    public void DutyFreePage(){driver.findElement(dutyfree).click();}
    public void OminiCart(){driver.findElement(ominicart).click();}
    public void HotDeals(){driver.findElement(hotdeals).click();}
    public void LoyalatyProgram(){driver.findElement(loyalatyProgram).click();}

}
