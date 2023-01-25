package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

//    @BeforeTest
//    @Parameters("browser")
//    public void setup(String browser) {
//        System.out.println("==========Browser is launching==========");
//        if (browser.equalsIgnoreCase("Chrome")) {
//            ChromeOptions options = new ChromeOptions();
//            WebDriverManager.chromedriver().setup();
//            options.addArguments("--headless");
//            driver = new ChromeDriver(options);
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        } else if (browser.equalsIgnoreCase("Edge")) {
//            EdgeOptions options = new EdgeOptions();
//            options.addArguments("--headless");
//            WebDriverManager.edgedriver().setup();
//            driver = new EdgeDriver(options);
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        } else if (browser.equalsIgnoreCase("Firefox")) {
//            FirefoxOptions options = new FirefoxOptions();
//            WebDriverManager.firefoxdriver().setup();
//            options.addArguments("--headless");
//            driver = new FirefoxDriver(options);
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        }
//    }
//
//    @Test(priority = 1)
//    public void loginSuccess(){
//
//    }



}
