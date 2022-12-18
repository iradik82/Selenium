package Selenium.class12;

import Selenium.FrameWork.Utils.CommonMethods;
import org.openqa.selenium.JavascriptExecutor;

import static Selenium.FrameWork.Utils.CommonMethods.driver;

public class jsExecutorScroll {
    public static void main(String[] args) {
        CommonMethods url=new CommonMethods();
        url.openWithSpecificUrl("https://www.amazon.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3000)");


        js.executeScript("window.scrollBy(0,-1500)");

    }
}
