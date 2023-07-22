package lesson8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import utils.Waiters;

import static org.testng.Assert.assertTrue;

public class Test0 {
    @Test
    public void checkPageTitle(){
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://klopotenko.com/en/");
        try {
            new Waiters(driver).waitForVisabilityOfWebElementReturn
                    (By.xpath("//a[@aria-label ='dismiss cookie message']")).click();
        } catch (Exception e){
            System.out.println("Cookies not Found");
        }
        System.out.println(driver.getTitle());
        assertTrue(driver.getTitle().contains("Chef Ievgen Klopotenko, culinary expert"));
        driver.quit();


    }
}
