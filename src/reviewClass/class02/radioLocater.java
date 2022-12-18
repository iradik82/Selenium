package reviewClass.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioLocater {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        List<WebElement> radioB = driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for(WebElement radiobb:radioB){

            //find the desired radio button

           String option = radiobb.getAttribute("value");
           if(option.equalsIgnoreCase("5 - 15")){
               //click on the button
               radiobb.click();
           }

        }
    }
}
