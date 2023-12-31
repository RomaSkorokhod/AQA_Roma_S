package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeEx3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe_frameborder_css");
        driver.findElement(By.id("accept-choices")).click();
        driver.switchTo().frame("iframeResult");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@style='border:1px solid black;']")));
        driver.findElement(By.id("accept-choices")).click();
        driver.findElement(By.id("signupbtn_topnav")).click();
        //accept-choices
        //iframe[@style='border:1px solid black;']
        //iframeResult
        //signupbtn_topnav
    }
}
