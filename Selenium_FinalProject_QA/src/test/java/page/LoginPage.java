package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // define inspect element (ganti variabel yah)
    By usernameInputText = By.xpath("//*[@id=\"user-name\"]");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By buttonLogin = By.xpath("//*[@id=\"login-button\"]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void inputUsername(String username){}

    public void inputPassword(String password){}

    public void clickButtonLogin(){}
    public void clickRegister(){}
    public void clickForgotPassword(){}
    public void clickLoginGoogle(){}
    public void clickLoginFB(){}
}
