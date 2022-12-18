package HomeWork.class4css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
HRMS Application Negative Login:
Open chrome browser
Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
Enter valid username
Leave password field empty
Click on login button
Verify error message with text “Password cannot be empty” is displayed.

 */
public class HM2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        //navigate to webpage
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");

        //send username
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");

        //click login
        driver.findElement(By.cssSelector("input.button")).click();

        //checking if its correct and displayed
        WebElement spanmsg = driver.findElement(By.cssSelector("span#spanMessage"));
        String text=spanmsg.getText();
        boolean display=spanmsg.isDisplayed();
        if(text.equals("Password cannot be empty")&& display){
            System.out.println("Text"+"'"+text+"'"+" is correct and it's displayed? = "+display);
        }else{
            System.out.println("Text"+"'"+text+"'"+" is incorrect or not displayed ");
        }



    }
}
