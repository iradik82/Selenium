package Selenium.class04CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditinalMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement btn=driver.findElement(By.cssSelector("button#buttoncheck"));
        String text=btn.getText();
        System.out.println(text);

        System.out.println("ndsjfnsk");


        System.out.println("bla bla bla");




        String idvalue=btn.getAttribute("id");

        System.out.println(idvalue);
    }
}
