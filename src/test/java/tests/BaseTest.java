package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginPage;

public class BaseTest {
    WebDriver driver;
    String url = "https://www.singersl.com/";

    @BeforeTest
    public void setUpTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        System.out.println("Opened Chrome browser and navigated to URL: " + url);
    }

    protected void setupLogin(){
        HomePage homepage = new HomePage(driver);
        homepage.loginButtonClick();
        System.out.println("Clicked on login button");

        LoginPage loginpage = new LoginPage(driver);
        loginpage.TextInEmail("test-txbmwm3f4@srv1.mail-tester.com");
        System.out.println("Entered email");

        loginpage.CodeInPassword("12345678");
        System.out.println("Entered password");

        loginpage.LoginButtonClick();
        System.out.println("Clicked on login submit button");
    }

//    @AfterTest
//    public void tearDown() throws InterruptedException {
//        if (driver != null) {
//            Thread.sleep(5000);
//            driver.quit();
//            System.out.println("Closed Chrome browser");
//        }
//        System.out.println("Test case execution completed");
//    }
}
