package HomeWork.class11;

import Selenium.class11.rightClick;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class HM1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

       WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

       Actions actions=new Actions(driver);
        actions.contextClick(rightClick).perform();



        driver.findElement(By.xpath("//span[text()='Edit']/..")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClick).perform();
       // Thread.sleep(1000);
        driver.switchTo().alert().accept();



    }
}
