package Final;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice {

    private static Actions actions;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://zapchasti.ria.com/uk/");
        driver.findElement(By.xpath("//label[@class='js-close c-notifier-btn']")).click();


        WebElement element = driver.findElement(By.xpath("//input[@class='flex-input autocomplete__input']"));
        element.sendKeys("Лампа розжарювання C10W 12V 10W BOSCH");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//h2[contains(text(),'BOSCH 1987302210')]")).click();
        driver.findElement(By.xpath("//span[@class='js-buy-text']")).click();
        driver.findElement(By.xpath("//a[@class='go-shop show-more-simple close-js']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@title='Кошик']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@class='button _green middle']")).click();
        Thread.sleep(4000);

       /* driver.switchTo().frame("login_frame");
        Thread.sleep(2000);*/
/*
        driver.switchTo().frame("//iframe[@src='https://www.ria.com/uk/iframe-ria-login/login/1/4']");
        driver.findElement(By.xpath("//a[contains(text(),'Зареєструватися на AUTO.RIA')]")).click();*/

    /*    driver.findElement(By.xpath("//form[@id='login-form']"));*/

     /*   driver.findElement(By.id("emailloginform-email")).sendKeys("Oleg");
        driver.findElement(By.id("emailloginform-password")).sendKeys("password");*/


       /* driver.findElement(By.xpath("//button[@data-callback='submitFormFn']")).click();
        Thread.sleep(3000);
        driver.quit();

*/







    }
}
