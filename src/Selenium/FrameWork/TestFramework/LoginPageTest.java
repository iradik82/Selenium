package Selenium.FrameWork.TestFramework;

import Selenium.FrameWork.Pages.loginPage;
import Selenium.FrameWork.Utils.CommonMethods;

public class LoginPageTest {
    public static void main(String[] args) {
        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        loginPage login =new loginPage();
        login.userNameField.sendKeys("Admin");
        login.passwordField.sendKeys("Hum@nhrm123");
        login.loginButton.click();

    }
}
