package tests;

import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.SingleProductPage;

public class SingleProductPageTest extends BaseTest {
    @Test(priority = 0)
    public void VerifyCheckOffersFunction() throws InterruptedException {
        MyAccountPage map = new MyAccountPage(driver);
        map.TextInSearchBar("Iphone 15");
        System.out.println("Typed 'Iphone 15' in the search bar");
        map.ClickSearchButton();
        System.out.println("Clicked on Search Button");
        Thread.sleep(2000);
        map.ClickProductCard();
        System.out.println("Clicked on Product Card");
        Thread.sleep(2000);
        SingleProductPage spp = new SingleProductPage(driver);
        spp.CheckOffersButton();
        System.out.println("Clicked on Check Offers Button");
        Thread.sleep(2000);
        spp.CheckAllBankOffers();
        System.out.println("Checked All Bank Offers");
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void AddSingleProductToCart() throws InterruptedException{
        SingleProductPage spp = new SingleProductPage(driver);
        spp.ClickSingleAddToCartButton();
        System.out.println("Clicked on Add to Cart Button on Single Product Page");
        Thread.sleep(2000);
        MyAccountPage mp = new MyAccountPage(driver);
        mp.ClickHomeButton();
        Thread.sleep(2000);
    }
}

