package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_xpath_text {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//a[text() = 'Standard application']")).getText());
        driver.quit();

         /*
        /.. вверх по дереву
        /tag_name вниз к указанному тегу
        /parent::tag_name переход на родительский тег
        /child::tag_name переход на дочерний тег
        //following-sibling::tag_name перход на параллельный тег
         */

/*        driver.get("https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/");
        Thread.sleep(2000);
        driver.findElement(By.id("ez-accept-all")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='APPLY']/../following-sibling::div[3]")).click();*/
    }
}
