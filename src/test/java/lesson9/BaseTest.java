package lesson9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.Waiters;

public class BaseTest {
    static WebDriver driver;
    static Waiters waiters;

    @BeforeSuite
    public void startTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        waiters = new Waiters(driver);
    }

    @AfterSuite
    public void stopTest(){
        driver.quit();
    }
}
