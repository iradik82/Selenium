package Selenium.class01Selenium181022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();
        driver.quit();
    }
}
