package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public static AppiumDriver<MobileElement> driver;
    protected static WebDriverWait wait;

    public static void setup() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        // SETUP HP ITSNA

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "1t5n4dh");
        cap.setCapability(MobileCapabilityType.UDID, "aeddd417");

        // SETUP HP TIARA

//         cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
//         cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
//         cap.setCapability(MobileCapabilityType.DEVICE_NAME, "1819");
//         cap.setCapability(MobileCapabilityType.UDID, "HIAYS4FYOB6TYHT4");

        // SET CAPABILITY APP
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        cap.setCapability("appium:appPackage", "com.example.fpsynrgy");
        cap.setCapability("appium:appActivity", "com.example.fpsynrgy.auth.AuthActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("Setup Done!!!");
    }

    public static void teardown() {
        driver.quit();
    }

    public void scrollDisplay(AppiumDriver<MobileElement> driverParam, int startX, int startY, int endX, int endY) {
        TouchAction<?> action = new TouchAction<>(driverParam);
        action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(startX, endY)).release().perform();
    }

}