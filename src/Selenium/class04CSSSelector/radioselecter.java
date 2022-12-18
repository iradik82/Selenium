package Selenium.class04CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioselecter {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        WebElement maleRadioBtn=driver.findElement(By.xpath("//input[@name='optradio'and @value='Male']"));
        //check if the radio button displayed
        boolean displayStatus=maleRadioBtn.isDisplayed();
        System.out.println("The radio button is displayed?:"+displayStatus);
        //check if the radio button enable
        boolean enableStatus =maleRadioBtn.isEnabled();
        System.out.println("The radio button is enabled?:"+enableStatus);
        //check if the radio button Selected
        boolean isSelected=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected?:"+isSelected);

        if(!isSelected){
            maleRadioBtn.click();
        }
        isSelected=maleRadioBtn.isSelected();
        System.out.println("The radio button is selected?:"+isSelected);

    }
}
