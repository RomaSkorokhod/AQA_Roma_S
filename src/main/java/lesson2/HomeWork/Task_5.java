package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Українська")).click();
        driver.findElement(By.xpath("//a[@class='page-header__phone']")).click();

    }
}
