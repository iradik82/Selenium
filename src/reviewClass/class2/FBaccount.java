package reviewClass.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class FBaccount {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://facebook.com");

        WebElement createAccB = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccB.click();
        Thread.sleep(2000);

        //Select the date from the down
        //approach to use the select
        //1.find the webElement that contains the select tag
        //2.use Select class Select sel =new Select(webElement)

        //find the webElement that contains the select tag
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        //use select class
        Select sel=new Select(day);

        //we have noe 3 methods
        //select by index
        sel.selectByIndex(4);
        Thread.sleep(1000);
        //2 Select by visible Text
        sel.selectByVisibleText("31");
        Thread.sleep(1000);
        // select by value
        sel.selectByValue("13");


       /* WebElement mounth = driver.findElement(By.xpath("//select[@id='month']"));
        Select mounthSelect=new Select(mounth);

        mounthSelect.selectByIndex(4);*/

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select yearSelect=new Select(year);

        Thread.sleep(2000);
        yearSelect.selectByVisibleText("1996");

        //print all the avaliable mounth

        WebElement mounth = driver.findElement(By.xpath("//select[@id='month']"));
        Select mounthSelect=new Select(mounth);

        List<WebElement> Options = mounthSelect.getOptions();

        for (int i = 0; i < Options.size(); i++) {
            String mountha=Options.get(i).getText();
            System.out.println(mountha);
        }


    }
}
