package Final;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test2 {

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


        WebElement element1 = driver.findElement(By.id("js-search-text"));
        element1.sendKeys("форсунка для Volkswagen Beetle");
        element1.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h2[contains(text(),'Volkswagen Beetle 1.6TDI 03L130277b')]")).click();
        driver.findElement(By.xpath("//span[@class='js-buy-text']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='go-shop show-more-simple close-js']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Кошик']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='ticket__remove']")).click();
        Thread.sleep(1000);

        driver.get("https://zapchasti.ria.com/uk/");
        WebElement element2 = driver.findElement(By.id("js-search-text"));
        element2.sendKeys("Мастило трансмісійне 1л 08886");
        element2.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h2[contains(text(),'Мастило трансмісійне 1л 08886')]")).click();
        driver.findElement(By.xpath("//span[@class='js-buy-text']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='go-shop show-more-simple close-js']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Кошик']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@class='ticket__remove']")).click();
        Thread.sleep(1000);

        driver.get("https://zapchasti.ria.com/uk/");
        WebElement element3 = driver.findElement(By.xpath("//input[@class='flex-input autocomplete__input']"));
        element3.sendKeys("Лампа розжарювання C10W 12V 10W BOSCH");
        element3.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//h2[contains(text(),'BOSCH 1987302210')]")).click();
        driver.findElement(By.xpath("//span[@class='js-buy-text']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='go-shop show-more-simple close-js']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Кошик']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='button _green middle']")).click();
        Thread.sleep(4000);

        driver.quit();












    }
}
