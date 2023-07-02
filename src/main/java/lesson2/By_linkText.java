package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_linkText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://guinnessworldrecords.com/records/apply-to-set-or-break-a-record");
        driver.findElement(By.linkText("APPLICATION PROCESS")).click();



    }
}
