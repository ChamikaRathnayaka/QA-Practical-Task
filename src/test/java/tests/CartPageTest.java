package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.MyAccountPage;

public class CartPageTest extends BaseTest {
    @Test(priority = 0)
    public void VerifyUpdateProductQuantity() throws InterruptedException {
        setupLogin();
        MyAccountPage map = new MyAccountPage(driver);
        map.TextInSearchBar("Iphone 15");
        System.out.println("Typed 'Iphone 15' in the search bar");
        map.ClickSearchButton();
        System.out.println("Clicked on Search Button");
        Thread.sleep(10);
        map.ClickAddCartIcon();
        System.out.println("Clicked on Add to Cart Icon");
        map.ClickCartIcon();
        System.out.println("Clicked on Cart Icon");
        CartPage cartpage = new CartPage(driver);
        cartpage.IncreaseProductCount();
        System.out.println("Increased product count");
    }

    @Test(priority = 1)
    public void VerifyUpdateMessage() {
        CartPage cartpage = new CartPage(driver);
        cartpage.confirmIncrease();
        System.out.println("Confirmed product count increase");
    }

    @Test(priority = 2)
    public void VerifyRemoveProduct() throws InterruptedException {
        CartPage cartpage = new CartPage(driver);
        cartpage.RemoveItemFromCart();
        System.out.println("Removed item from cart");
        Thread.sleep(2000);
    }
}
