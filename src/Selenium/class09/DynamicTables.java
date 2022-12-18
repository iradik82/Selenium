package Selenium.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTables {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

//        check the checkBox that contains "screen saver" as a product
        List<WebElement> secondCol = driver.findElements(By.xpath("//table[@Class='SampleTable']/tbody/tr/td[3]"));
//        traverse through the list
        for (int i = 0; i <secondCol.size() ; i++) {
           // System.out.println(secondCol.get(i).getText());
            String columText = secondCol.get(i).getText();
            if(columText.equalsIgnoreCase("ScreenSaver")){
                //   print out the index of the column/row which contains the Screen saver
                System.out.println("index of row where screenSaver located"+i+1);

                //get the checkbox
                //table[@class='SampleTable']/tbody/tr[2]/td[1]
                //table[@class='SampleTable']/tbody/tr[4]/td[1]
                WebElement checkbox1 = driver.findElement(By.xpath("//table[@Class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkbox1.click();
                //click

            }

        }

    }
}
