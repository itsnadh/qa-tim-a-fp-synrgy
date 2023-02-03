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

    @FindBy(id = "com.example.fpsynrgy:id/textView15")
    WebElement yukDaftarText;

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

    @FindBy(id = "com.example.fpsynrgy:id/etRegisterRePassword")
    WebElement confirmPasswordField;

    @FindBy(id = "com.example.fpsynrgy:id/btnRegister")
    WebElement registerBtn;

    public void ValidateOnRegisterPage() {
        var text = yukDaftarText.getText();

        Assert.assertEquals(text, "Yuk daftar agar bisa cari kos dengan nyaman dan cepat");
    }

    public void inputRegFirstName(String fName) {
        firstNameField.sendKeys(fName);
    }

    public void inputRegLastName(String lName) {
        lastNameField.sendKeys(lName);
    }

    public void inputRegPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);
    }

    public void inputRegEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputRegPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputRegConfirmPassword(String confirmPass) {
        confirmPasswordField.sendKeys(confirmPass);
    }

    public void clickRegisterBtn() {
        registerBtn.click();
    }

}
