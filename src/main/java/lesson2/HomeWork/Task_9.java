package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_9 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.jetbrains.com/idea/");
        driver.findElement(By.xpath("//a[@class='wt-col-inline menu-second__download-button wt-button wt-button_size_s wt-button_mode_primary']")).click();
    }
        }
