package Selenium.class10Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.delta.com");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //click on the calendar
        WebElement calender = driver.findElement(By.xpath("//span[text()='Depart']"));
        calender.click();
        //get the month and check if it is the month we want
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean isFound = false;
        while (!isFound) {
            String monthName = month.getText();
            if(monthName.equalsIgnoreCase("March")){
//               get all the dates from the table
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
//               traverse through the list to find your desried date
                for(WebElement date:dates){
                    String currentDate = date.getText();
                    if(currentDate.equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }
                }
                System.out.println("i have found the desried month :" +monthName);
                isFound=true;
            }
            else{
                WebElement nxtBtn = driver.findElement(By.xpath("//span[text()='Next']"));
                nxtBtn.click();
            }


        }
    }
}