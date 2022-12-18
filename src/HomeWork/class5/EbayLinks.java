package HomeWork.class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/*
1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
 */
public class EbayLinks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Thread.sleep(1000);
        //get categories list webElement
        WebElement categoriesList = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select listCategories = new Select(categoriesList);
        //store all options from categories list
        List<WebElement> listCategorOptions = listCategories.getOptions();
//loop to go through all elements
        for (int i = 0; i < listCategorOptions.size(); i++) {
//store elements in a variable
            WebElement option = listCategorOptions.get(i);
            // get text for all elements
            String text = option.getText();
            //print all elements in console
            System.out.println(text);
            //check for categories we need "Computers/Tablets & Networking"
            if (text.equalsIgnoreCase("Computers/Tablets & Networking")) {
                listCategories.selectByIndex(i);
            }}
        //click on search button
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        //get title element
        String title = driver.getTitle();
        System.out.println("Title " + title);
        //verifying title
if(title.equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay")){
    System.out.println("Title is verified");
}else {
    System.out.println("error ");
}
    }
}
