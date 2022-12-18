package HomeWork.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HM2Implicit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://syntaxprojects.com/dynamic-data-loading-demo.php");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//find New User webElement and click on it
        WebElement newUserBtn= driver.findElement(By.xpath("//button[@id='save']"));
        newUserBtn.click();

//get first name and print it on a console
        WebElement nameElement = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[2]/p"));
       String name= nameElement.getText();
        System.out.println(name);
    }
}
