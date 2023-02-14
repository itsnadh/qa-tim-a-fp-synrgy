package appium.page;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import appium.BaseTest;

public class DetailKamarPage extends BaseTest {

    public AppiumDriver<MobileElement> driverPage;

    public DetailKamarPage() {
        this.driverPage = driver;
        PageFactory.initElements(driverPage, this);
    }
    @FindBy(id = "com.example.fpsynrgy:id/tvNamaKamar")
    WebElement tipeKamar;

    @FindBy(id = "com.example.fpsynrgy:id/btnTanggal")
    WebElement kalenderBtn;

    @FindBy(id = "com.example.fpsynrgy:id/btnDuration")
    WebElement durationBtn;

    @FindBy(xpath = "//android.view.View[@content-desc=\"28 Februari 2023\"]")
    WebElement tgl28Feb;

    @FindBy(id = "com.example.fpsynrgy:id/btnDone")
    WebElement selectBtn;

    @FindBy(id = "com.example.fpsynrgy:id/btnBased")
    WebElement monthlyBtn;

    @FindBy(id = "com.example.fpsynrgy:id/btnSewa")
    WebElement sewaBtn;

    public void onDetailKamarPage(){
        tipeKamar.isDisplayed();
    }
    public void clickKalender() {
        kalenderBtn.click();
    }

    public void clickDuration() {
        durationBtn.click();
    }

    public void clickSelect(){
        selectBtn.click();
    }
    public void pilihTanggal() {
        tgl28Feb.click();
    }

    public void pilihDurasi() {
        monthlyBtn.click();
    }

    public void clickSewaBtn() {
        sewaBtn.click();
    }

}
