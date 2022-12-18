package Selenium.class12;

import Selenium.FrameWork.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class uploadFile {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
        chooseFile.sendKeys("/Users/radik/Desktop/Screenshot 2022-11-19 at 12.37.28 PM.png");


    }
}
