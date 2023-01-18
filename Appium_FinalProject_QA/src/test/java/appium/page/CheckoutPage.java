package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class CheckoutPage extends BaseTest{
    public AppiumDriver<MobileElement> driverPage;

    public CheckoutPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }
}
