package appium.page;

import appium.BaseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class PengajuanSewaPage extends BaseTest {
    public AppiumDriver<MobileElement> driverPage;

    Dimension size;
    public PengajuanSewaPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
        this.size = driverPage.manage().window().getSize();
    }

    @FindBy(id = "com.example.fpsynrgy:id/textView18")
    WebElement pengajuanText;

    @FindBy(id = "com.example.fpsynrgy:id/btnSubmit")
    WebElement ajukanSewaBtn;

    public void onPengajuanSewaPage() {
        pengajuanText.isDisplayed();
    }

    public void clickSewaBtn() {

        Boolean param = true;

        while (param) {
            try {
                ajukanSewaBtn.click();
                param = false;
            } catch (Exception e) {
                scrollDisplay(this.driverPage, size.width / 2, size.height / 2, size.width / 2, (int) (size.height * 0.4));
            }
        }
    }
}
