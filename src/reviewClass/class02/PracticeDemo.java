package reviewClass.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //When user sends in the username Admin

        WebElement userName = driver.findElement(By.id("txtUsername"));
        //send the user bane
        userName.sendKeys("Admin");


        //then user sends wrong password
        WebElement userPass = driver.findElement(By.id("txtPassword"));
        userPass.sendKeys("fiwemfow");

        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        //get the error message from the DOM
        WebElement errorMSS= driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String error=errorMSS.getText();

        //verification
        if(error.equalsIgnoreCase("Invalid credentials")){
            System.out.println("Text is correct");
        }else{
            System.out.println("text is incorrect");
        }

    }
}
