package appium.page;

import appium.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class KonfirmasiPemilikPage extends BaseTest {
    public AppiumDriver<MobileElement> driverPage;

    public KonfirmasiPemilikPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }

    @FindBy(id = "com.example.fpsynrgy:id/textView51")
    WebElement konfirmasiText;

    @FindBy(id = "com.example.fpsynrgy:id/button8")
    WebElement hubungiBtn;

    public void onKonfirmasiPenyediaPage() {
        konfirmasiText.isDisplayed();
    }

    public void clickHubungi() {
        hubungiBtn.click();
    }

}
