package HomeWork.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code
 */
public class Task1Facebook {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        //click on open account
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        //fill out first and last name
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ivan");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Radetskyi");
        //fill out phone and password
        driver.findElement(By.name("reg_email__")).sendKeys("8187463545");
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abracadabra");
        Thread.sleep(1000);
        //select mounth
        WebElement mounth = driver.findElement(By.xpath("//select[@id='month']"));
        Select selectMounth=new Select(mounth);
        selectMounth.selectByVisibleText("May");
        //select day
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select selectday=new Select(day);
        selectday.selectByIndex(12);
        //select year
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select selectYear=new Select(year);
        selectYear.selectByValue("1996");
        //select gender
        driver.findElement(By.xpath("//input[@value='2']")).click();


    }
}