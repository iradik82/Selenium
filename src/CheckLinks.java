import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;

public class CheckLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        for(int i=0;i<links.size();i++){
            String linkURL = links.get(i).getAttribute("href");
            if(linkURL!=null){
                URL obj =new URL(linkURL);
                HttpURLConnection conn =((HttpURLConnection) obj.openConnection());

                int rCode =conn.getResponseCode();
                if(rCode==200){
                    System.out.println(i+1+ " Link is valid ----" +linkURL);
                }else{
                    System.out.println(i+ " Link is broken---"+ linkURL);
                }
            }else{
                System.out.println(links.get(i).getText());
                System.out.println(i+ " Links is broken ******"+ linkURL);
            }
        }
        driver.quit();
    }
}
