package Selenium.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //switch focus to iframe
        driver.switchTo().frame(0);
//draggble
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
  //location
        WebElement dropLoc = driver.findElement(By.xpath("//div[@id='droppable']"));

        Actions actions=new Actions(driver);
       // actions.dragAndDrop(drag,dropLoc).perform();
        actions.clickAndHold(drag).moveToElement(dropLoc).release().build().perform();
    }
}
