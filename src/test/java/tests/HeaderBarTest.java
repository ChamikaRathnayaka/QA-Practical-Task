package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderBar;

public class HeaderBarTest extends BaseTest {
    @Test(priority = 0)
    public void CheckProductPage() {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.productPage();
        String expected = "https://www.singersl.com/products";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Product Page: " + actual);
    }
    @Test(priority = 1)
    public void CheckBrandPage() {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.brandsPage();
        String expected = "https://www.singersl.com/brands";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Brands Page: " + actual);
    }
    @Test(priority = 2)
    public void CheckDutyFreePage() {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.DutyFreePage();
        String expected = "https://www.singersl.com/duty-free";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Duty Free Page: " + actual);
    }
}
