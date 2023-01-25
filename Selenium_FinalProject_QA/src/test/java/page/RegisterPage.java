package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import static org.testng.AssertJUnit.assertEquals;

public class RegisterPage {
    WebDriver driver;

    // define variable first name, last name, phone number, email, pass, confirm pass, regist btn
    By pencariKos = By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/a/p");
    By penyediaKos = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/a/p");
    By firstName = By.id("formBasicFirstName");
    By lastName = By.id("formBasicLastName");
    By phoneNumber = By.id("formBasicNomorHandphone");
    By email = By.id("formBasicEmail");
    By password = By.id("formBasicPassword");
    By confirmPass = By.id("formBasicverofPassword");
    By registerBtn = By.xpath("//button[@type=\"submit\" and text()=\"Register\"]");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    //define methods

    public void registAsSeeker(){
        driver.findElement(pencariKos).click();
    }
    public void registAsTenant(){
        driver.findElement(penyediaKos).click();
    }
    public void inputFirstName(){
        driver.findElement(firstName).sendKeys("Lala");
    }
    public void inputLastName(){
        driver.findElement(lastName).sendKeys("Lili");
    }
    public void inputPhoneNumber(){
        driver.findElement(phoneNumber).sendKeys("083456789012");
    }
    public void inputEmail(){
        driver.findElement(email).sendKeys("lalatenant@mail.com");
    }
    public void inputPassword(){
        driver.findElement(password).sendKeys("12345678");
    }
    public void inputConfirmPassword(){
        driver.findElement(confirmPass).sendKeys("12345678");
    }
    public void clickRegistrationBtn() throws InterruptedException {
        Boolean enable = driver.findElement(registerBtn).isEnabled();
        System.out.println("Registration btn is " + enable);

        WebElement myelement = driver.findElement(registerBtn);
        JavascriptExecutor jse2 = (JavascriptExecutor)driver;
        jse2.executeScript("arguments[0].scrollIntoView()", myelement);
        System.out.println("web scrolled");

        Thread.sleep(3000);
        driver.findElement(registerBtn).click();
        System.out.println("Registration btn clicked");
    }
}