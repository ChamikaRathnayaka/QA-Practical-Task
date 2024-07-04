package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    protected static WebDriver driver;
    String url = "https://www.singersl.com/";

    @BeforeSuite
    public void setUpSuite() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(url);
            System.out.println("Opened Chrome browser and navigated to URL: " + url);
        }
    }

    @AfterSuite
    public void tearDownSuite() throws InterruptedException {
        if (driver != null) {
            Thread.sleep(5000);
            driver.quit();
            driver = null;
            System.out.println("Closed Chrome browser");
        }
        System.out.println("Test suite execution completed");
    }
}
