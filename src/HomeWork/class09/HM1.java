package HomeWork.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HM1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

// log in
        WebElement name = driver.findElement(By.id("txtUsername"));
        name.sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();

        //click on PIM
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        //get employeId 44869A	Emret Nada
        List<WebElement> empoyeId = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
        for (int i = 0; i <empoyeId.size() ; i++) {
       String textID=empoyeId.get(i).getText();
       if(textID.equalsIgnoreCase("44869A")){
           int rownum=i+1;
           WebElement box = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + rownum + "]/td[1]"));
           box.click();
           break;
       }
        }

    }
}
