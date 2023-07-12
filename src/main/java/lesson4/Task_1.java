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

        driver.get("https://guinnessworldrecords.com/");
        System.out.println(driver.getTitle());
        Set<String> windowHandles1 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open");
        Set<String> windowHandles2 = driver.getWindowHandles();
        windowHandles2.removeAll(windowHandles1);
        String newDescriptor = windowHandles2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get("https://terrikon.com/");

      /*  Set<String> window3 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open");
        Set<String> window4 = driver.getWindowHandles();
        window4.removeAll(window3);
        driver.switchTo().window(window4.iterator().next());
        driver.get("https://guinnessworldrecords.com/");
        System.out.println(driver.getTitle());
        driver.close();
        Thread.sleep(2000);
        driver.quit();

        */

    }
}
