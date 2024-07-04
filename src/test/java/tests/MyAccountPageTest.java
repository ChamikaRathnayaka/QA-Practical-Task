package tests;

import org.testng.annotations.Test;
import pages.MyAccountPage;
public class MyAccountPageTest extends BaseTest {
    @Test(priority = 0)
    public void SearchSingleKeywordItem() throws InterruptedException{
        MyAccountPage myaccountpage= new MyAccountPage(driver);
        myaccountpage.TextInSearchBar("Iphone");
        System.out.println("Typed 'Iphone' in the search bar");
        myaccountpage.ClickSearchButton();
        System.out.println("Clicked on Search Button");
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Navigated back");
    }

    @Test(priority = 1)
    public void SearchNoResultItem() throws  InterruptedException{
        MyAccountPage myaccountpage= new MyAccountPage(driver);
        myaccountpage.TextInSearchBar("gshxjs");
        System.out.println("Typed 'gshxjs' in the search bar");
        myaccountpage.ClickSearchButton();
        System.out.println("Clicked on Search Button");
        Thread.sleep(2000);
        myaccountpage.CheckNoResult();
        System.out.println("Checked for no search result");
        driver.navigate().back();
        System.out.println("Navigated back");
    }

    @Test(priority = 2)
    public void SearchMultipleKeywordItem() throws InterruptedException{
        MyAccountPage myaccountpage= new MyAccountPage(driver);
        myaccountpage.TextInSearchBar("Iphone 15");
        System.out.println("Typed 'Iphone 15' in the search bar");
        myaccountpage.ClickSearchButton();
        System.out.println("Clicked on Search Button");
        Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void ClickAddCartIcon() throws InterruptedException{
        MyAccountPage myAccountPage=new MyAccountPage(driver);
        myAccountPage.ClickAddCartIcon();
        System.out.println("Clicked on Add to Cart Icon");
        Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void ViewSingleProduct() throws InterruptedException{
        MyAccountPage myaccountpage=new MyAccountPage(driver);
        myaccountpage.ClickProductCard();
        System.out.println("Clicked on Product Card");
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Navigated back");
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void ClickCartIcon() throws InterruptedException{
        MyAccountPage myAccountPage= new MyAccountPage(driver);
        myAccountPage.ClickCartIcon();
        Thread.sleep(2000);
        System.out.println("Clicked on Cart Icon");
        myAccountPage.ClickHomeButton();
        Thread.sleep(2000);
    }
}
