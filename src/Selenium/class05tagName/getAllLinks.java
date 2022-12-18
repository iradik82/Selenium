package Selenium.class05tagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class getAllLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
        //get all the links i.e. anchor from the website
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));
        // print the size of the list
        System.out.println("the size of the list is: "+ebayLinks.size());

        for (WebElement ebayLink:ebayLinks){

           String link=ebayLink.getAttribute("href");
            System.out.println(link);
        }
    }
}
