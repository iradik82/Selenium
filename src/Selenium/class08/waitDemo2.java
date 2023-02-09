package Selenium.class08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitDemo2 {
   public static void main(String[] args) {
        //        set the path to the driver to link it with our class  on Mac u don't need .exe on Windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.get( "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.id("alert")).click();

        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
//        handle the alert
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
    }
}

