package Selenium.class07WindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://accounts.google.com/signup");
        //driver.get( "http://accounts.google.com/signup");
        //get the window handle for the current page
       String gmailHandle=driver.getWindowHandle();
       //print
        System.out.println(gmailHandle);

    }
}
