package Selenium.class05tagName;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.TreeMap;

public class MultiplleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        WebElement dd = driver.findElement(By.xpath("//select[@id='multi-select']"));
        //using select class
        Select sel=new Select(dd);
        //by index
        sel.selectByIndex(3);
        sel.selectByVisibleText("Texas");
        sel.selectByValue("Ohio");

        Thread.sleep(2000);
        //deselect by index
        sel.deselectByIndex(3);

        //sellect All
        List<WebElement> options = sel.getOptions();
        for (int i = 0; i <options.size() ; i++) {
            sel.selectByIndex(i);

        }
        Thread.sleep(1000);
        //deselect all
        sel.deselectAll();

        //how can we check if the drop Down is multi select or not
        boolean multiselect=sel.isMultiple();
        System.out.println(multiselect);

    }
}
