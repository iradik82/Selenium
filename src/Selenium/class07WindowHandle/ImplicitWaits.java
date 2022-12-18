package Selenium.class07WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaits {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "http://facebook.com");


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        //click on create new account
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        //send the first name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("jhdnijg");


    }
}
