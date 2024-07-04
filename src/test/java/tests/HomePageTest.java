package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    @Test(priority = 0)
    public void navigateToHomePage() {
        String expected = "https://www.singersl.com/";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Home Page: " + actual);
    }
    @Test(priority = 1)
    public void validateLoginButton() {
        HomePage homepage = new HomePage(driver);
        homepage.loginButtonClick();
        System.out.println("Clicked on Login Button");
    }
}
