package lesson2.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Отыскать один элемент на основе другого.
        Для нахождения первого элемента можете использовать любые методы и локаторы,
        для прописывания дальнейшего поиска второго элемента не использовать текст.
        P.S. Не получается сделать это задание. Если есть возможность, отправте пожалуйста
        код, попробую сам разобратся. Спасибо
        */
public class Task_8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dan-it.com.ua/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Українська")).click();

        driver.findElement(By.xpath("//p[@class='main-info__title']")).click();



    }
}
