package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class By_tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://guinnessworldrecords.com/search");
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        inputs.get(1).sendKeys("Most handstand push ups");
        driver.findElement(By.id("search-button")).click();
    }
}
