package reviewClass.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class waitReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

       WebElement checkBox =  driver.findElement(By.xpath("//input[@type='checkbox']"));
       checkBox.click();

        WebElement remove = driver.findElement(By.xpath("//button[text()='Remove']"));
        remove.click();

        WebElement text = driver.findElement(By.xpath("//p[text()= \"It's gone!\"]"));
        String textfrom = text.getText();
        System.out.println(textfrom);

        driver.findElement(By.xpath("//button[text()='Enable']")).click();

      WebDriverWait  wait=new WebDriverWait(driver,20);
      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']"))).sendKeys("ffsdfsfds");

      ////input[@type='text']
    }
}
