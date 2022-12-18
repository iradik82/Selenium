package HomeWork.class3xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankAcc {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Alex");
        driver.findElement(By.id("customer.lastName")).sendKeys("Gora");
        driver.findElement(By.id("customer.address.street")).sendKeys("647 Owl st.");
        driver.findElement(By.id("customer.address.city")).sendKeys("Pittsburgh");
        driver.findElement(By.id("customer.address.state")).sendKeys("PA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("15317");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("8183546321");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.ssn")).sendKeys("8474362");
        driver.findElement(By.id("customer.username")).sendKeys("RadikRad");
        driver.findElement(By.id("customer.password")).sendKeys("radik");
        driver.findElement(By.id("repeatedPassword")).sendKeys("radik");
        Thread.sleep(3000);
        driver.findElement(By.className("button")).click();
        driver.quit();




    }
}