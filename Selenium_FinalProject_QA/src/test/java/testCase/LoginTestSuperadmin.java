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

public class LoginTestSuperadmin {

    WebDriver driver;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    @BeforeTest
    public void setup() {
        System.out.println("==========Browser is launching==========");
        driver = WebDriverManager.chromedriver().create();
//        driver.get("https://frontend-fsw-testing.vercel.app/login");
        driver.get("https://frontend-fsw-testing.vercel.app/login/superadmin");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, SECONDS);
    }

    @Test
    public void loginAsSuperadmin() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        Thread.sleep(2000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/login/superadmin");
        System.out.println("Sukses buka link login");
        loginPage.inputEmail("superadmin@mail.com");
        loginPage.inputPassword("password");
        loginPage.clickButtonLogin();
        Thread.sleep(5000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/admin");
        Thread.sleep(2000);
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }
}
