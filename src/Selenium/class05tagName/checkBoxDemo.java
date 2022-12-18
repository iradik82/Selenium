package Selenium.class05tagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));

        checkBox.click();
    }
}
