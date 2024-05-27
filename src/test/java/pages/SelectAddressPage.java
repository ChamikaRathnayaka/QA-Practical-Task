package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SelectAddressPage {
    WebDriver driver;
    WebDriverWait wait;

    By add_new_address= By.id("edit-new-button");
    By enter_name=By.xpath("//input[@id='name']");
    By street_line1=By.xpath("//input[@id='address_line_one']");
    By street_line2=By.xpath("//input[@id='address_line_two']");
    By city_placeholder=By.xpath("//select[@id='city']");
    By mobile=By.xpath("//body/div[3]/main[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[6]/div[1]/input[1]");
    By nic=By.xpath("//input[@id='edit-address-information-profile-nic-number']");
    By delevery_note=By.xpath("//textarea[@id='edit-address-information-profile-delivery-notes']");
    By continue_button=By.xpath("//input[@id='edit-actions-next']");
    By purchase_friend_tick=By.xpath("//input[@id='edit-address-information-profile-add-purchaser-information']");
    By receiver_name=By.xpath("//input[@id='edit-address-information-profile-purchaser-name']");
    By receiver_mobile=By.xpath("//input[@id='edit-address-information-profile-purchaser-mobile-number']");
    By receiver_address_line1=By.xpath("//input[@id='edit-address-information-profile-purchaser-address']");
    By receiver_address_line2=By.xpath("//input[@id='edit-address-information-profile-purchaser-address-two']");
    By receiver_city=By.xpath("//select[@id='edit-address-information-profile-purchaser-city']");


    public SelectAddressPage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }
    public void ClickAddNewAddressButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_new_address));
        driver.findElement(add_new_address).sendKeys(Keys.RETURN);}
    public void FillEnterName(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(add_new_address));
        driver.findElement(enter_name).sendKeys(text);}
    public void FillStreetLine1(String text){driver.findElement(street_line1).sendKeys(text);}
    public void FillStreetLine2(String text){driver.findElement(street_line2).sendKeys(text);}
    public void FillCity(String text){
        driver.findElement(city_placeholder).sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobile));
        driver.findElement(city_placeholder).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(city_placeholder).sendKeys(text);
    }
    public void FillMobile(String number){driver.findElement(mobile).sendKeys(number);}
    public void FillNic(String id){
        driver.findElement(nic).clear();
        driver.findElement(nic).sendKeys(id);
    }
    public void FillDeleveryNote(String text){driver.findElement(delevery_note).sendKeys(text);}
    public void ClickContinueButton(){driver.findElement(continue_button).sendKeys(Keys.RETURN);}
    public void ClickTickForFriend(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(purchase_friend_tick)).perform();
        driver.findElement(purchase_friend_tick).click();
    }
    public void FillReceiverName(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(receiver_name));
        driver.findElement(receiver_name).sendKeys(text);
    }
    public void FillReceiverMobile(String number){driver.findElement(receiver_mobile).sendKeys(number);}
    public void FillReceiverLine1(String text){driver.findElement(receiver_address_line1).sendKeys(text);}
    public void FillReceiverLine2(String text){driver.findElement(receiver_address_line2).sendKeys(text);}
    public void FillReceiverCity(String text){
        driver.findElement(receiver_city).sendKeys(Keys.RETURN);
        driver.findElement(receiver_city).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(receiver_city).sendKeys(text);
    }


}
