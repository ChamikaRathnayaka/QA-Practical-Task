package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderBar {
    WebDriver driver;
    By product= By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[1]");
    By brands=By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]");
    By dutyfree=By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]");

    public HeaderBar(WebDriver driver) {
        this.driver=driver;
    }

    public void productPage(){driver.findElement(product).click();}
    public void brandsPage(){driver.findElement(brands).click();}
    public void DutyFreePage(){driver.findElement(dutyfree).click();}
}
