package Selenium.class03Selenium261022Xpstch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpatchDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("//input[@name='email']")).sendKeys("iradik98765");
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hfyf8yr32oj");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

    }
}
