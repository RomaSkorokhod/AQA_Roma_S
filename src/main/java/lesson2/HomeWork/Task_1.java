package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://uhomki.com.ua/koshki/1074/");

//        driver.findElement(By.className("userbar__button-text")).click();

//        driver.findElement(By.linkText("Вхід")).click();

//        driver.findElement(By.xpath("//span[text()='Вхід']")).click();

        driver.findElement(By.cssSelector("svg.icon.icon--user")).click();


    }
}
