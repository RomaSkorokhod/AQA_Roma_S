package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jetbrains.com/idea/download/#section=windows");

//        driver.findElement(By.xpath("//a[@href='/idea/download/download-thanks.html?platform=windows']")).click();

        driver.findElement(By.xpath("//a[@href='/idea/download/download-thanks.html?platform=windows&code=IIC']")).click();

    }

}
