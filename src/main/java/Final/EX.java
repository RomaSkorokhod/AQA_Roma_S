package Final;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EX {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://auto.ria.com/uk/login.html?from_url=/uk/cabinet/");
        driver.findElement(By.xpath("//label[@class='js-close c-notifier-btn']")).click();
        driver.switchTo().frame("login_frame");
        driver.findElement(By.xpath("//a[contains(text(),'Зареєструватися на AUTO.RIA')]")).click();

        driver.findElement(By.xpath("//form[@id='login-form']"));
        driver.findElement(By.id("registrationform-name")).sendKeys("Roman");
        driver.findElement(By.id("registrationform-second_name")).sendKeys("Shevchenko");
        driver.findElement(By.id("registrationform-email")).sendKeys("Sheva@ukr.net");

        driver.quit();
    }
}
