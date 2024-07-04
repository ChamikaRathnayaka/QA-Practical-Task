package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.MyAccountPage;
import pages.SelectAddressPage;

public class SelectAddressTest extends BaseTest {
    @Test(priority = 0)
    public void NavigateNewAddressPage() throws InterruptedException {
        MyAccountPage map=new MyAccountPage(driver);
        map.TextInSearchBar("Iphone 15");
        map.ClickSearchButton();
        System.out.println("Clicked on Search Button");
        Thread.sleep(2000);
        map.ClickAddCartIcon();
        System.out.println("Clicked on Add to Cart Icon");
        map.ClickCartIcon();
        System.out.println("Clicked on Cart Icon");
        Thread.sleep(2000);
        CartPage cartpage=new CartPage(driver);
        cartpage.ClickPlaceOrderButton();
        System.out.println("Clicked on Place Order Button");
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void AddNewAddress() throws InterruptedException{
        SelectAddressPage sap= new SelectAddressPage(driver);
        sap.ClickAddNewAddressButton();
        System.out.println("Clicked on Add New Address Button");
        Thread.sleep(2000);
        sap.FillEnterName("Nimal Perera");
        System.out.println("Entered Name");
        Thread.sleep(1000);
        sap.FillStreetLine1("Katubedda");
        System.out.println("Entered Street Line 1");
        Thread.sleep(1000);
        sap.FillStreetLine2("Moratuwa");
        System.out.println("Entered Street Line 2");
        Thread.sleep(1000);
        sap.FillCity("Colombo");
        System.out.println("Entered City");
        Thread.sleep(1000);
        sap.FillMobile("0771234567");
        System.out.println("Entered Mobile");
        Thread.sleep(1000);
        sap.FillNic("971234567V");
        System.out.println("Entered NIC");
        Thread.sleep(1000);
        sap.FillDeleveryNote("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.");
        System.out.println("Entered Delivery Note");
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void TestPurchasingFriendsDetails() throws InterruptedException{
        SelectAddressPage sap=new SelectAddressPage(driver);
        sap.ClickTickForFriend();
        System.out.println("Clicked on Tick for Friend");
        Thread.sleep(2000);
        sap.FillReceiverName("Sadun Perera");
        System.out.println("Entered Receiver's Name");
        Thread.sleep(1000);
        sap.FillReceiverMobile("0712345678");
        System.out.println("Entered Receiver's Mobile");
        Thread.sleep(1000);
        sap.FillReceiverLine1("1st lane");
        System.out.println("Entered Receiver's Street Line 1");
        Thread.sleep(1000);
        sap.FillReceiverLine2("Ibbagamuwa");
        System.out.println("Entered Receiver's Street Line 2");
        Thread.sleep(1000);
        sap.FillReceiverCity("Kurunegala");
        System.out.println("Entered Receiver's City");
        Thread.sleep(1000);
        sap.ClickContinueButton();
        System.out.println("Clicked on Continue Button");
        Thread.sleep(1000);
        String expected = "https://www.singersl.com/order/payment-method";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
        System.out.println("Asserted URL");
        driver.navigate().back();
        System.out.println("Navigated Back");
        Thread.sleep(1000);
    }
}

