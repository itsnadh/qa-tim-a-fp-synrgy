package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class DetailKostPage extends BaseTest {
    public AppiumDriver<MobileElement> driverPage;

    Dimension size;

    public DetailKostPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
        this.size = driverPage.manage().window().getSize();
    }

    @FindBy(id = "com.example.fpsynrgy:id/tvTitleDetail")
    WebElement titleKost;

    @FindBy(id = "com.example.fpsynrgy:id/textView39")
    WebElement tipeKamarKost;

    @FindBy(id = "com.example.fpsynrgy:id/button4")
    WebElement pilihBtn;

    public void onDetailKostPage() {
        titleKost.isDisplayed();
    }

    public void clickPilih() {
        Boolean param = true;

        while (param) {
            try {
                pilihBtn.click();
                param = false;
            } catch (Exception e) {
                scrollDisplay(this.driverPage, size.width / 2, size.height / 2, size.width / 2, (int) (size.height * 0.4));
            }
        }
    }
}
