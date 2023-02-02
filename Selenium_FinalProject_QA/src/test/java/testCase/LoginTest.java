package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.AssertJUnit.assertEquals;

public class LoginTest {

    WebDriver driver;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @BeforeTest
    public void setup() {
        System.out.println("==========Browser is launching==========");
        driver = WebDriverManager.chromedriver().create();
//        driver.get("https://frontend-fsw-testing.vercel.app/login");
        driver.get("https://frontend-fsw-testing.vercel.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, SECONDS);
    }

    @Test(priority = 1)
    public void loginAsSeeker() throws InterruptedException {
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
    }

    @Test(priority = 2)
    public void loginAsTenant() throws InterruptedException{
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
    }

    @Test(priority = 3)
    public void logOutFromSeeker() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginAsSeeker();
        loginPage.logOut();
        Thread.sleep(3000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/");
    }

    @Test(priority = 4)
    public void logOutFromTenant() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginAsTenant();
        loginPage.logOut();
        Thread.sleep(3000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/");
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
