package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class LoginPage extends BaseTest {

    public AppiumDriver<MobileElement> driverPage;

    public LoginPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }

    @FindBy(id = "com.example.fpsynrgy:id/textView4")
    WebElement silakanText;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    WebElement emailField;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    WebElement passField;

    @FindBy(id = "com.example.fpsynrgy:id/btnLogin")
    WebElement loginBtn;

    @FindBy(id = "com.example.fpsynrgy:id/ctaToRegister")
    WebElement registerLink;

    @FindBy(id = "com.example.fpsynrgy:id/ctaForgotPassword")
    WebElement forgotPassLink;

    @FindBy(id = "com.example.fpsynrgy:id/button")
    WebElement googleBtn;

    @FindBy(id = "com.example.fpsynrgy:id/button2")
    WebElement fbBtn;

    // methods & functions

    public void validateOnLoginPage() {
        var text = silakanText.getText();

        Assert.assertEquals(text, "Silahkan untuk login");
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passField.sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void clickRegister() {
        registerLink.click();
    }

    public void clickForgotPass() {
        forgotPassLink.click();
    }

    public void clickLoginGoogle() {
        googleBtn.click();
    }

    public void clickLoginFb() {
        fbBtn.click();
    }
}