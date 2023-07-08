package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        driver.get("https://uhomki.com.ua/koshki/1074/");

        actions.moveToElement(driver.findElements(By.xpath("//a[@href='/akvariumistika/1124/']")).get(0))
                .moveToElement(driver.findElement(By.xpath("//span[text()='Акваріуми']"))).click().build().perform();


    }
}
