package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/ru/koshki/1074/");

        driver.findElement(By.xpath("//div[@class='footer__heading']/..//a[@href='/ru/sobaki/']")).click();


    }
}
