package Selenium.class12;

import Selenium.FrameWork.Pages.LoginPageWithPageFactory;
import Selenium.FrameWork.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Selenium.FrameWork.Utils.CommonMethods.driver;

public class jsexecutoryHighliht {
    public static void main(String[] args) {
        CommonMethods url=new CommonMethods();
        url.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        WebElement username=driver.findElement(By.id("txtUsername"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].style.backgroundColor='blue'",username);

    }
}
