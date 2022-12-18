package Selenium.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class iframeswitch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://chercher.tech/practice/frames");

        //set cat from drop box

        driver.switchTo().frame(1);

        WebElement animals = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String listAnimal= animals.getText();
        System.out.println(listAnimal);

        WebElement animalList =  driver.findElement(By.xpath("//select[@id='animals']"));
        Select listAnimals=new Select(animalList);
        List<WebElement> AnList = listAnimals.getOptions();
        for (int i = 0; i < AnList.size(); i++) {
            WebElement option = AnList.get(i);
            String text = option.getText();
            if(text.equals("Baby Cat")){
                listAnimals.selectByIndex(i);
            }
        }
        Thread.sleep(1000);
        //switch to default
        driver.switchTo().defaultContent();


        driver.switchTo().frame("frame1");
        WebElement inpuText = driver.findElement(By.xpath("//input"));
        inpuText.sendKeys("DONE");

        driver.switchTo().frame(0);
        Thread.sleep(1000);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
         checkBox.click();
    }
}
