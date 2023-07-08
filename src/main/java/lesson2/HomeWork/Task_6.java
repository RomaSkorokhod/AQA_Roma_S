package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Українська")).click();
        driver.findElement(By.xpath("//li[@class='banner-meta__item banner-meta__item--main banner-meta__item--main--offline']")).click();

    }
}
