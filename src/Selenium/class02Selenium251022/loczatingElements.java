package Selenium.class02Selenium251022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loczatingElements {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");


        driver.findElement(By.id("email")).sendKeys("radik82978");
        driver.findElement(By.name("pass")).sendKeys("12345");
        driver.findElement(By.name("login")).click();


        // driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot ")).click();
    }
}