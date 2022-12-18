package HomeWork.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HM3WelcomeSyntax {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://syntaxprojects.com/dynamic-elements-loading.php");

        //find start sebElement and click on it
        driver.findElement(By.xpath("//button")).click();

        WebElement ElementofText = driver.findElement(By.xpath("//h4[contains(text(),'Welcome')]"));
        String textforElement=ElementofText.getText();
        System.out.println("Here is your text"+textforElement);
    }
}
