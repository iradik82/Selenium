package Selenium.class05tagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class multipleCheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        //find all check boxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkBox:checkBoxes){
            //get attribute value to check if this is the right option to select
            String optionName =checkBox.getAttribute("value");
            //if condition to make sure it is the right checkbos
            if(optionName.equals("Option-3")){
                checkBox.click();
            }
        }
    }
}
