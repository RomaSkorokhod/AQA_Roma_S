package lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ktokuda.net/");

        WebElement countries = driver.findElement(By.id("itt_country"));
        Select countriesSelect = new Select(countries);
        countriesSelect.selectByValue("98");
        Thread.sleep(2000);
        countriesSelect.selectByVisibleText("Мальдивы");


    }

}
