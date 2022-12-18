package Selenium.class07WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class waitTime {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://syntaxprojects.com/dynamic-elements-loading.php");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //click on start button

        driver.findElement(By.xpath("//button[@id='startButton']")).click();

        WebElement welcometxt = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String text=welcometxt.getText();
        System.out.println("hgiygl"+text);

// implicit wait is waiting until the element is found

    }
}
