package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/");
        Thread.sleep(4000);
        driver.findElement(By.linkText("Українська")).click();
        driver.findElement(By.xpath("//h1[@class='banner__title']/..//following-sibling::a[@class='main-banner-btn btn-gradient']")).click();


    }
}
