package HomeWork.class4css;
/*
HW1
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username and password (username - Admin, password - Hum@nhrm123)
Click on login button
Then verify the message "Welcome Admin " is there on the top right corner
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        //navigate the web
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //send login and password
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[type^='pass']")).sendKeys("Hum@nhrm123");
        Thread.sleep(1000);

        //log in
        driver.findElement(By.cssSelector("input.button")).click();

        //checking right conner if it's correct
        WebElement Welcome = driver.findElement(By.cssSelector("a#welcome"));
        String text=Welcome.getText();
        if(text.equals("Welcome Admin")) {
            System.out.println("Text "+ "'" + text+"'"+" is correct");
        }else{
            System.out.println("Text is incorrect ");
        }
    }
}
