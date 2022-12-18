package Selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsDemo {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.get( "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                driver.manage().window().maximize();
//        click on the button "change text to selenium webDriver"
        WebElement button = driver.findElement(By.xpath("//button[@id='populate-text']"));
        button.click();
//        get the text Selenium WebDriver
        WebElement webdrivText = driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        String text=webdrivText.getText();
        System.out.println(text);
//task 2
        //click on the button "display text after 10 sec"
        WebElement displayButt = driver.findElement(By.xpath("//button[@id='display-other-button']"));
        displayButt.click();

        WebDriverWait wait= new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));

        WebElement displayBt = driver.findElement(By.xpath("//button[@id='hidden']"));
        displayBt.click();
// Task3
        WebElement button3rd = driver.findElement(By.xpath("//button[@id='enable-button']"));
        button3rd.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='enable-button']")));

        WebElement hidenbut = driver.findElement(By.xpath("//button[@id='enable-button']"));
        hidenbut.click();

        WebElement button4 = driver.findElement(By.xpath("//button[@id='checkbox']"));
        button4.click();
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//button[@id='checkbox']")));
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();


    }
}
