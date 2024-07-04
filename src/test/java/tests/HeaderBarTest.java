//package tests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.HeaderBar;
//
//public class HeaderBarTest extends BaseTest {
//    @Test(priority = 0)
//    public void CheckProductPage() {
//        HeaderBar headerbar = new HeaderBar(driver);
//        headerbar.productPage();
//        String expected = "https://www.singersl.com/products";
//        String actual = driver.getCurrentUrl();
//        Assert.assertEquals(actual, expected);
//        System.out.println("Navigated to Product Page: " + actual);
//    }
//    @Test(priority = 1)
//    public void CheckBrandPage() {
//        HeaderBar headerbar = new HeaderBar(driver);
//        headerbar.brandsPage();
//        String expected = "https://www.singersl.com/brands";
//        String actual = driver.getCurrentUrl();
//        Assert.assertEquals(actual, expected);
//        System.out.println("Navigated to Brands Page: " + actual);
//    }
//    @Test(priority = 2)
//    public void CheckDutyFreePage() {
//        HeaderBar headerbar = new HeaderBar(driver);
//        headerbar.DutyFreePage();
//        String expected = "https://www.singersl.com/duty-free";
//        String actual = driver.getCurrentUrl();
//        Assert.assertEquals(actual, expected);
//        System.out.println("Navigated to Duty Free Page: " + actual);
//    }
//    @Test(priority = 3)
//    public void OminiCartPage() {
//        HeaderBar headerbar = new HeaderBar(driver);
//        headerbar.OminiCart();
//        String expected = "https://www.singersl.com/filter?search=omni-cart-products";
//        String actual = driver.getCurrentUrl();
//        Assert.assertEquals(actual, expected);
//        System.out.println("Navigated to Duty Free Page: " + actual);
//    }
//    @Test(priority = 4)
//    public void HotDealsPage() {
//        HeaderBar headerbar = new HeaderBar(driver);
//        headerbar.HotDeals();
//        String expected = "https://www.singersl.com/products?category=-&brands=-&offers=-@2093&availability=-@1&page=1&search=&lastChange=availability";
//        String actual = driver.getCurrentUrl();
//        Assert.assertEquals(actual, expected);
//        System.out.println("Navigated to Duty Free Page: " + actual);
//    }
//    @Test(priority = 5)
//    public void LoyalityProgramPage() {
//        HeaderBar headerbar = new HeaderBar(driver);
//        headerbar.LoyalatyProgram();
//        String expected = "https://www.singersl.com/added-services/singer-red-loyalty-program";
//        String actual = driver.getCurrentUrl();
//        Assert.assertEquals(actual, expected);
//        System.out.println("Navigated to Duty Free Page: " + actual);
//    }
//
//}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderBar;

public class HeaderBarTest extends BaseTest {
    @Test(priority = 0)
    public void CheckProductPage() throws InterruptedException {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.productPage();
        Thread.sleep(3000);
        String expected = "https://www.singersl.com/products";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Product Page: " + actual);
    }

    @Test(priority = 1)
    public void CheckBrandPage() throws InterruptedException {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.brandsPage();
        Thread.sleep(3000); // Add 2 seconds delay
        String expected = "https://www.singersl.com/brands";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Brands Page: " + actual);
    }

    @Test(priority = 2)
    public void CheckDutyFreePage() throws InterruptedException {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.DutyFreePage();
        Thread.sleep(3000); // Add 2 seconds delay
        String expected = "https://www.singersl.com/duty-free";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Duty Free Page: " + actual);
    }

    @Test(priority = 3)
    public void OminiCartPage() throws InterruptedException {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.OminiCart();
        Thread.sleep(3000); // Add 2 seconds delay
        String expected = "https://www.singersl.com/filter?search=omni-cart-products";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Omni Cart Page: " + actual);
    }

    @Test(priority = 4)
    public void HotDealsPage() throws InterruptedException {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.HotDeals();
        Thread.sleep(3000);
        String expected = "https://www.singersl.com/products?category=-&brands=-&offers=-@2093&availability=-@1&page=1&search=&lastChange=availability";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Hot Deals Page: " + actual);
    }

    @Test(priority = 5)
    public void LoyalityProgramPage() throws InterruptedException {
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.LoyalatyProgram();
        Thread.sleep(3000);
        String expected = "https://www.singersl.com/added-services/singer-red-loyalty-program";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
        System.out.println("Navigated to Loyalty Program Page: " + actual);
    }

    @Test(priority = 6)
    public void BackToProductPage() throws InterruptedException{
        HeaderBar headerbar = new HeaderBar(driver);
        headerbar.productPage();
        Thread.sleep(3000);
    }
}

