package HomeWork.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HM1Gmail {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "http://accounts.google.com/signup");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//get handle for google.com
        String gmailCom=driver.getWindowHandle();
//click on help button
        WebElement helpbtn = driver.findElement(By.xpath("//a[text()='Help']"));
      helpbtn.click();
//click on privacy button
        WebElement privacybtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacybtn.click();
//get all HM1Gmail
        Set<String> allHandles = driver.getWindowHandles();
//get to help window
        for(String handle:allHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                break;
            }

        }
//find and click on community button
        WebElement communitybtn=driver.findElement(By.xpath("//a[text()='Community']"));
        communitybtn.click();
//go back to gmail.com
        driver.switchTo().window(gmailCom);
//find username web element  and sen keys

        WebElement userName=driver.findElement(By.xpath("//input[@type='email']"));
        userName.sendKeys("everything done successful");
    }
}
