package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test(priority = 0)
    public void EnterInValidEmail(){
        HomePage homepage = new HomePage(driver);
        homepage.loginButtonClick();
        System.out.println("Clicked on login button");
        LoginPage loginpage = new LoginPage(driver);
        loginpage.TextInEmail("chamika@gmail.com");
        System.out.println("Entered InValid email");
        loginpage.CodeInPassword("12345678");
        System.out.println("Entered Valid password");
        loginpage.LoginButtonClick();
        System.out.println("Clicked on login submit button");
        if( loginpage.InvalidCredentials()){
            loginpage.ClickInvalidOk();
            System.out.println("Can not login-TestCase pass");
        }
        else {
            loginpage.isMyAccountPageLoaded();
        }
    }

    @Test(priority = 1)
    public void EnterInValidPassword() {
        driver.navigate().back();
        HomePage homepage=new HomePage(driver);
        homepage.loginButtonClick();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.TextInEmail("test-txbmwm3f4@srv1.mail-tester.com");
        System.out.println("Entered Valid email");
        loginpage.CodeInPassword("123456781245");
        System.out.println("Entered InValid password");
        loginpage.LoginButtonClick();
        System.out.println("Clicked on login submit button");
        if( loginpage.InvalidCredentials()){
            loginpage.ClickInvalidOk();
            System.out.println("Can not login-TestCase pass");
        }
        else {
            loginpage.isMyAccountPageLoaded();
        }
    }

    @Test(priority = 2)
    public void EnterValidCredentials() {
        driver.navigate().back();
        HomePage homepage=new HomePage(driver);
        homepage.loginButtonClick();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.TextInEmail("test-txbmwm3f4@srv1.mail-tester.com");
        System.out.println("Entered Valid email");
        loginpage.CodeInPassword("12345678");
        System.out.println("Entered Valid password");
        loginpage.LoginButtonClick();
        System.out.println("Clicked on login submit button");
        loginpage.isMyAccountPageLoaded();
        System.out.println("Verified My Account page loaded");
    }
}


