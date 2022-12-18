package Selenium.class10Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HM1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement name = driver.findElement(By.id("txtUsername"));
        name.sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
        driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();


        WebElement mounth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(mounth);
        List<WebElement> allMounth = select.getOptions();
        for (WebElement mount:allMounth) {


            String textMounth = mount.getText();
            if (textMounth.equalsIgnoreCase("May")) {
                mount.click();
                break;

            }
        }
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selectyear=new Select(year);
        List<WebElement> allYears = selectyear.getOptions();
        for (WebElement years:allYears){
            String yearText=years.getText();
            if(yearText.equalsIgnoreCase("1996")){
                years.click();
                break;
            }
        }
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
for(WebElement date:dates){
    String currentDate= date.getText();
    if(currentDate.equalsIgnoreCase("13")){
        date.click();
        break;
    }
}
driver.quit();
    }
}
