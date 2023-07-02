package lesson2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://guinnessworldrecords.com/records/");
        driver.findElement(By.xpath("//i[@class = 'icon icon-search']")).click();
        Thread.sleep(4000);
        WebElement element = driver.findElement(By.xpath("//input[@id = 'search-term']"));
        element.sendKeys("Good Morning");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@id = 'search-button']")).click();



    }
}
