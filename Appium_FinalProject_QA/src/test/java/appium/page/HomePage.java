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

    @FindBy(id = "com.example.fpsynrgy:id/tvTitleDetail")
    WebElement cariKosanText;

    @FindBy(id = "com.example.fpsynrgy:id/homeFragment")
    WebElement menuHome;

    @FindBy(id = "com.example.fpsynrgy:id/searchFragment")
    WebElement menuSearch;

    @FindBy(id = "com.example.fpsynrgy:id/likedFragment")
    WebElement menuLike;

    @FindBy(id = "com.example.fpsynrgy:id/profileFragment")
    WebElement menuProfile;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup")
    WebElement photoKost2;

    public void onHomePage() {
        var text = cariKosanText.getText();

        Assert.assertEquals(text, "Cari kosan terbaik dari kami");
    }

    public void goToHome() {
        menuHome.click();
    }

    public void goToSearch() {
        menuSearch.click();
    }

    public void goToLike() {
        menuLike.click();
    }

    public void goToProfile() {
        menuProfile.click();
    }

    public void clickKost2() {
        photoKost2.click();
    }
}