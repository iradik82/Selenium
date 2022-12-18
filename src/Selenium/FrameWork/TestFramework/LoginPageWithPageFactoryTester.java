package Selenium.FrameWork.TestFramework;

import Selenium.FrameWork.Utils.CommonMethods;
import Selenium.FrameWork.Pages.LoginPageWithPageFactory;

public class LoginPageWithPageFactoryTester {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        LoginPageWithPageFactory login=new LoginPageWithPageFactory();
        login.userName.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }
}
