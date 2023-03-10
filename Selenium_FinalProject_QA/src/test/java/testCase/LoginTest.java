package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import page.LoginPage;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.AssertJUnit.assertEquals;

public class LoginTest {

    WebDriver driver;

    // @Rule
    // public ExpectedException expectedEx = ExpectedException.none();
    // @BeforeTest
    // @Parameters("browser")
    // public void setup(@Optional("Chrome")String browser) throws
    // InterruptedException {
    // if (browser.equalsIgnoreCase("Chrome")) {
    // System.out.println("==========Browser is launching==========");
    // ChromeOptions options = new ChromeOptions();
    // WebDriverManager.chromedriver().setup();
    // options.addArguments("--headless");
    // driver = new ChromeDriver(options);
    // driver.manage().window().maximize();
    // driver.manage().timeouts().implicitlyWait(8, SECONDS);
    // } else if (browser.equalsIgnoreCase("Firefox")) {
    // System.out.println("==========Browser is launching==========");
    // FirefoxOptions options = new FirefoxOptions();
    // WebDriverManager.firefoxdriver().setup();
    // options.addArguments("--headless");
    // driver = new FirefoxDriver(options);
    // driver.manage().window().maximize();
    // driver.manage().timeouts().implicitlyWait(8, SECONDS);
    // }
    // }

    @BeforeMethod
    public void setup() {
        System.out.println("==========Browser is launching==========");
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://frontend-fsw-testing.vercel.app/login");
        // driver.get("https://frontend-fsw-testing.vercel.app/login/superadmin");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, SECONDS);
    }

    @Test(priority = 1)
    public void loginLogoutAsSeeker() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.clickLoginCTA();
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/login");
        System.out.println("Sukses buka link login");
        loginPage.loginAsSeeker();
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/login/pencari");
        System.out.println("Sukses buka link login seeker");
        Thread.sleep(3000);
        loginPage.inputEmail("seeker@mail.com");
        loginPage.inputPassword("password");
        loginPage.clickButtonLogin();
        Thread.sleep(5000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/");
        Thread.sleep(2000);
        loginPage.logOut();
        Thread.sleep(3000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/");
    }

    @Test(priority = 2)
    public void loginLogoutAsTenant() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        loginPage.clickLoginCTA();
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/login");
        System.out.println("Sukses buka link login");
        loginPage.loginAsTenant();
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/login/penyewa");
        System.out.println("Sukses buka link login tenant");
        Thread.sleep(3000);
        loginPage.inputEmail("tennant@mail.com");
        loginPage.inputPassword("password");
        loginPage.clickButtonLogin();
        Thread.sleep(5000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/penyewa");
        Thread.sleep(2000);
        loginPage.logOut();
        Thread.sleep(3000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/");
    }

    // @Test(priority = 3)
    // public void logOutFromSeeker() throws InterruptedException {
    // LoginPage loginPage = new LoginPage(driver);
    // loginAsSeeker();
    // loginPage.logOut();
    // Thread.sleep(3000);
    // assertEquals(driver.getCurrentUrl(),
    // "https://frontend-fsw-testing.vercel.app/");
    // }

    // @Test(priority = 4)
    // public void logOutFromTenant() throws InterruptedException {
    // LoginPage loginPage = new LoginPage(driver);
    // loginAsTenant();
    // loginPage.logOut();
    // Thread.sleep(3000);
    // assertEquals(driver.getCurrentUrl(),
    // "https://frontend-fsw-testing.vercel.app/");
    // }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
