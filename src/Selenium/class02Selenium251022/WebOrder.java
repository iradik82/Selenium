package Selenium.class02Selenium251022;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //driver.manage().window().maximize();
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.className("button")).click();
String title = driver.getTitle();
        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The Title is correct :"+title);
        }else{
            System.out.println("The tittle is incorrect :"+title);
        }
        Thread.sleep(10000);
driver.quit();
    }
}