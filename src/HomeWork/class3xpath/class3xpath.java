package HomeWork.class3xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/");
Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@id,'btn')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Simple")).click();
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Hello my name is Ivan and here is my massage to you");
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}
