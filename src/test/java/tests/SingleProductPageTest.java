package tests;

import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.SingleProductPage;

public class SingleProductPageTest extends BaseTest {
    @Test(priority = 0)
    public void VerifyCheckOffersFunction() throws InterruptedException {
        setupLogin();
        MyAccountPage map = new MyAccountPage(driver);
        map.TextInSearchBar("Iphone 15");
        System.out.println("Typed 'Iphone 15' in the search bar");
        map.ClickSearchButton();
        System.out.println("Clicked on Search Button");
        map.ClickProductCard();
        System.out.println("Clicked on Product Card");
        SingleProductPage spp = new SingleProductPage(driver);
        spp.CheckOffersButton();
        System.out.println("Clicked on Check Offers Button");
        spp.CheckAllBankOffers();
        System.out.println("Checked All Bank Offers");
    }

    @Test(priority = 1)
    public void AddSingleProductToCart() {
        SingleProductPage spp = new SingleProductPage(driver);
        spp.ClickSingleAddToCartButton();
        System.out.println("Clicked on Add to Cart Button on Single Product Page");
    }
}

