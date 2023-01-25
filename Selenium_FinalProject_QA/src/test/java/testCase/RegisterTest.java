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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.RegisterPage;

import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.AssertJUnit.assertEquals;

public class RegisterTest {
    WebDriver driver;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @BeforeTest
    public void setup() {
        System.out.println("==========Browser is launching==========");
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://frontend-fsw-testing.vercel.app/register");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, SECONDS);
    }

    @Test(priority = 1)
    public void registAsSeeker() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(driver);
        Thread.sleep(2000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/register");
        System.out.println("Sukses buka link register");
        Thread.sleep(3000);
        registerPage.registAsSeeker();
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/register/pencari");
        System.out.println("Sukses buka link regist as seeker");
        Thread.sleep(3000);
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputPhoneNumber();
        registerPage.inputEmail();
        registerPage.inputPassword();
        registerPage.inputConfirmPassword();
        Thread.sleep(5000);
        registerPage.clickRegistrationBtn();
        Thread.sleep(10000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/register/verification");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void registAsTenant() throws InterruptedException{
        RegisterPage registerPage = new RegisterPage(driver);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/register");
        System.out.println("Sukses buka link register");
        Thread.sleep(3000);
        registerPage.registAsTenant();
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/register/penyewa");
        System.out.println("Sukses buka link regist as tenant");
        Thread.sleep(3000);
        registerPage.inputFirstName();
        registerPage.inputLastName();
        registerPage.inputPhoneNumber();
        registerPage.inputEmail();
        registerPage.inputPassword();
        registerPage.inputConfirmPassword();
        Thread.sleep(5000);
        registerPage.clickRegistrationBtn();
        Thread.sleep(10000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/register/verification");
        Thread.sleep(2000);
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}
