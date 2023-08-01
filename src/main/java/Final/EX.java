package Final;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EX {

    private static Actions actions;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://auto.ria.com/uk/");
        driver.findElement(By.xpath("//label[@class='js-close c-notifier-btn']")).click();
        ((JavascriptExecutor)driver).executeScript("");
        driver.get("https://zapchasti.ria.com/uk/");


        WebElement element = driver.findElement(By.xpath("//input[@class='flex-input autocomplete__input']"));
        element.sendKeys("Лампа розжарювання C10W 12V 10W BOSCH");
        element.sendKeys(Keys.ENTER);







    }
}
