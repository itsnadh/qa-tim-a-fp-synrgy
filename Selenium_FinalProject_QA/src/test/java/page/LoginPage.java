package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    // define inspect element
    By pencariKos = By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/a/p");
    By penyewaKos = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/a/p");
    By inputEmail = By.id("formBasicEmail");
    By inputPassword = By.id("formBasicPassword");
    By loginBtn = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/form/div[3]/button");
    By dropDownProfile = By.id("basic-nav-dropdown");
    By logoutBtn = By.xpath("//a[@class=\"dropdown-item\" and text()=\"Logout\"]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginAsSeeker(){
        driver.findElement(pencariKos).click();
    }

    public void loginAsTenant(){
        driver.findElement(penyewaKos).click();
    }
    public void inputEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void inputPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickButtonLogin(){
        driver.findElement(loginBtn).click();
    }

    public void logOut() throws InterruptedException {
        driver.findElement(dropDownProfile).click();
        Thread.sleep(2000);
        driver.findElement(logoutBtn).click();
    }
//    public void clickRegister(){}
//    public void clickForgotPassword(){}
//    public void clickLoginGoogle(){}
//    public void clickLoginFB(){}
}
