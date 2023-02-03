package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class VerificationPage extends BaseTest {

    public AppiumDriver<MobileElement> driverPage;

    public VerificationPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }

    @FindBy(id = "com.example.fpsynrgy:id/textView5")
    WebElement verificationText;

    @FindBy(id = "com.example.fpsynrgy:id/textView5")
    WebElement kirimUlang;

    @FindBy(id = "com.example.fpsynrgy:id/btnBackLogin")
    WebElement backLoginBtn;

    public void validateOnVerificationPage() {
        var text = verificationText.getText();

        Assert.assertEquals(text, "Verifikasi");
    }

    public void kirimUlangLink() {
        kirimUlang.click();
    }

    public void backToLogin() {
        backLoginBtn.click();
    }

}