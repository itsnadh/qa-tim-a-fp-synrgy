package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class ProfilePage extends BaseTest {

    public AppiumDriver<MobileElement> driverPage;

    public ProfilePage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }

    @FindBy(id = "com.example.fpsynrgy:id/textView21")
    WebElement profileText;
    @FindBy(id = "com.example.fpsynrgy:id/ctaLogout")
    WebElement logoutBtn;

    public void onProfilePage(){
        profileText.isDisplayed();
    }
    public void clickLogout() {
        logoutBtn.click();
    }
}
