package HomeWork.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class iframes {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        //navigate focus to iframe with checkBox
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        //click on check box
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        //navigate to frame with drop down
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        //find webElement,get options make loop to find text "Baby Cat" and select it
        WebElement animalsList = driver.findElement(By.xpath("//select[@id='animals']"));
        Select listAnimal=new Select(animalsList);
        List<WebElement> options = listAnimal.getOptions();
        Thread.sleep(1000);
        for (int i = 0; i <options.size() ; i++) {
            WebElement option = options.get(i);
            String text = option.getText();
            if(text.equals("Baby Cat")){
                listAnimal.selectByIndex(i);
            }}
        //navigate to frame with text
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        //find webElement and send text"DONE"
        driver.findElement(By.tagName("input")).sendKeys("DONE");
        }
    }
