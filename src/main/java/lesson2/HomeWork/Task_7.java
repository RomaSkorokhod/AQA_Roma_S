package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");

        WebElement element1 = driver.findElement(By.id("search2"));
        element1.sendKeys("SQL");

       /* WebElement element2 = driver.findElement(By.id("navbtn_tutorials"));
        element2.click();*/

       /* WebElement element3 = driver.findElement(By.id("navbtn_services"));
        element3.click();*/

        /*WebElement element4 = driver.findElement(By.id("w3loginbtn"));
        element4.click();*/

       /* WebElement element5 = driver.findElement(By.id("signupbtn_topnav"));
        element5.click();*/


    }
}
