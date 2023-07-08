package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Task_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        driver.get("https://dan-it.com.ua/uk/");

        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Для дітей']")))
                .pause(Duration.ofSeconds(2))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Академічна вища ІТ освіта']")))
                .click().build().perform();



    }
}
