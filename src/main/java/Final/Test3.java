package Final;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test3 {

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
        driver.findElement(By.xpath("//h2[contains(text(),'BOSCH 1987302210')]")).click();
        driver.findElement(By.xpath("//span[@class='js-buy-text']")).click();
        driver.findElement(By.xpath("//a[@class='go-shop show-more-simple close-js']")).click();

        WebElement element2 = driver.findElement(By.id("js-search-text"));
        element2.sendKeys("форсунка для Volkswagen Beetle");
        element2.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h2[contains(text(),'Volkswagen Beetle 1.6TDI 03L130277b')]")).click();
        driver.findElement(By.xpath("//span[@class='js-buy-text']")).click();
        driver.findElement(By.xpath("//a[@class='go-shop show-more-simple close-js']")).click();

        WebElement element3 = driver.findElement(By.id("js-search-text"));
        element3.sendKeys("Мастило трансмісійне 1л 08886");
        element3.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h2[contains(text(),'Мастило трансмісійне 1л 08886')]")).click();
        driver.findElement(By.xpath("//span[@class='js-buy-text']")).click();
        driver.findElement(By.xpath("//a[@class='go-shop show-more-simple close-js']")).click();












    }
}
