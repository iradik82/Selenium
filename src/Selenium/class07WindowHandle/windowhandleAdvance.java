package Selenium.class07WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowhandleAdvance {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "http://accounts.google.com/signup");

        //click on help button
        WebElement helpbtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpbtn.click();
        //click on privacy button
        WebElement privacybtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacybtn.click();

        //the tittle of my desired page is  Google Account Help

        //get all the window HM1Gmail
        Set<String> allHandles = driver.getWindowHandles();

        for (String handle:allHandles) {
            //switching the focus to the current handle from list
            driver.switchTo().window(handle);
            //get the tittle of the window to which the driver has switched
            String title = driver.getTitle();
            //compare if the tittle is of the help
            if (title.equalsIgnoreCase("Google Account Help")) {
                System.out.println("we are on privacy page");
                break;
            }
        }

                //find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();







    }
}
