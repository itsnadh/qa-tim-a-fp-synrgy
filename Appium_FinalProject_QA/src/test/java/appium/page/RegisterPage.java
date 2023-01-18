package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class RegisterPage extends BaseTest {
    public AppiumDriver<MobileElement> driverPage;

    public RegisterPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }

    @FindBy(id = "com.example.fpsynrgy:id/etRegisterFName")
    WebElement firstNameField;

    @FindBy(id = "com.example.fpsynrgy:id/etRegisterLName")
    WebElement lastNameField;

    @FindBy(id = "com.example.fpsynrgy:id/etRegisterLName")
    WebElement phoneNumberField;

    @FindBy(id = "com.example.fpsynrgy:id/etRegisterEmail")
    WebElement emailField;

    @FindBy(id = "com.example.fpsynrgy:id/etRegisterPassword")
    WebElement passwordField;

    @FindBy(id = "com.example.fpsynrgy:id/etRegisterPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "com.example.fpsynrgy:id/btnRegister")
    WebElement registerBtn;


}
