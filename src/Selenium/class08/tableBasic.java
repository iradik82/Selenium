package Selenium.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tableBasic {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class  on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "drivers/chromedrivernew");
        // create a WebDriver instance

        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement allTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String tableText=allTable.getText();
       // System.out.println(tableText);

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:rows
             ) { String rowText=row.getText();
            if(rowText.contains("Google"))
            System.out.println(rowText);


        }

        List<WebElement> colums = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement colum:colums){
            String textCol=colum.getText();
            System.out.println(textCol);
        }
    }
}
