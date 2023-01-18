package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class HomePage extends BaseTest {
    public AppiumDriver<MobileElement> driverPage;

    public HomePage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }

    @FindBy(id = "com.example.fpsynrgy:id/homeFragment")
    WebElement homeMenu;

    public void onHomePage(){
        homeMenu.isSelected();
    }

    public void clickHome(){

    }

}