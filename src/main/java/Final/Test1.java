package Final;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://auto.ria.com/uk/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@class='js-close c-notifier-btn']")).click();

        WebElement category = driver.findElement(By.id("categories"));
        Select categorySelect = new Select(category);
        categorySelect.selectByValue("8");

        Actions actions = new Actions(driver);
        WebElement type1 = driver.findElements(By.id("brandTooltipBrandAutocompleteInput-brand")).get(0);
        actions.moveToElement(type1).click().build().perform();
        WebElement type2 = driver.findElements(By.xpath("//a[@data-value='48']")).get(0);
        actions.moveToElement(type2).click().build().perform();

        WebElement model1 = driver.findElements(By.id("brandTooltipBrandAutocomplete-model")).get(0);
        actions.moveToElement(model1).click().build().perform();
        WebElement model2 = driver.findElements(By.xpath("//a[@data-value='35249']")).get(0);
        actions.moveToElement(model2).click().build().perform();

        WebElement region = driver.findElement(By.id("brandTooltipBrandAutocompleteInput-region"));
        region.sendKeys("Київ");
        region.sendKeys(Keys.ARROW_DOWN);
        region.sendKeys(Keys.ENTER);


        WebElement year = driver.findElements(By.xpath("//label[@for='forYear']")).get(0);
        actions.moveToElement(year).click().build().perform();


     /*   driver.findElement(By.id("yearFrom")).click();
        WebElement year1 = driver.findElement(By.id("yearFrom"));
        Select yearSelect1 = new Select(year1);
        categorySelect.selectByValue("2005");*/

  /*      WebElement year2 = driver.findElement(By.id("yearTo"));
        Select yearSelect2 = new Select(year2);
        categorySelect.selectByValue("2015");*/



    }
}
