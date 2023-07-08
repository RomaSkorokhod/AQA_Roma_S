package lesson4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task_1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/");
        System.out.println(driver.getTitle());
        Set<String> window1 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open");
        Set<String> window2 = driver.getWindowHandles();
        window2.removeAll(window1);
        String newDescriptor = window2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get("https://guinnessworldrecords.com/");

        Set<String> window3 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open");
        Set<String> window4 = driver.getWindowHandles();
        window4.removeAll(window3);
        driver.switchTo().window(newDescriptor);




    }
}
