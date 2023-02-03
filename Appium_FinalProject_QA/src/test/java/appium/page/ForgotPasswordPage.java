package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class ForgotPasswordPage extends BaseTest {
    public AppiumDriver<MobileElement> driverPage;

    public ForgotPasswordPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }

    @FindBy(id = "com.example.fpsynrgy:id/textView3")
    WebElement lupaPasswordText;

    @FindBy(id = "com.example.fpsynrgy:id/etEmailForgot")
    WebElement emailField;

    @FindBy(id = "com.example.fpsynrgy:id/btnForgot")
    WebElement sendLinkBtn;

    public void validateOnLupaPasswordPage() {
        var text = lupaPasswordText.getText();

        Assert.assertEquals(text, "Lupa Password");
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void clickSendLinkBtn() {
        sendLinkBtn.click();
    }
}
