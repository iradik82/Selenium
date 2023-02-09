package Selenium.class01Selenium181022;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class maximizeWindow {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        WebElement field = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        field.sendKeys("Ukraine", Keys.ENTER);

        WebElement wikipidia = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div/div/div[1]/div/a/h3"));
        Actions actions=new Actions(driver);
        actions.contextClick(wikipidia).perform();
       // driver.quit();
      //  driver.close();
    }
}
