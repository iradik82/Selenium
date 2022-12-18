package Selenium.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
Thread.sleep(2000);
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();

        driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
        Alert simpleAlert2 = driver.switchTo().alert();
        Thread.sleep(1000);
        simpleAlert2.dismiss();

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
       Alert simpleAler3= driver.switchTo().alert();
       simpleAler3.sendKeys("coca-cola");
       simpleAler3.accept();
    }
}
