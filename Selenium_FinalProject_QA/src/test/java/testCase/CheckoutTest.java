package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;
import page.DetailKostPage;
import page.DetailKamarPage;
import page.PengajuanSewaPage;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.AssertJUnit.assertEquals;

public class CheckoutTest {
    WebDriver driver;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @BeforeTest
    public void setup() {
        System.out.println("==========Browser is launching==========");
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://frontend-fsw-testing.vercel.app/login");
        // driver.get("https://frontend-fsw-testing.vercel.app/login/superadmin");
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
        // assertEquals(driver.getCurrentUrl(),
        // "https://frontend-fsw-testing.vercel.app/");
        Thread.sleep(2000);
    }

    @Test(priority = 2)
    public void chechkoutKost() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        // DetailKamarPage dkamar = new DetailKamarPage(driver);
        DetailKostPage dkost = new DetailKostPage(driver);
        PengajuanSewaPage psewa = new PengajuanSewaPage(driver);

        homePage.clickKost1();
        Thread.sleep(3000);
        dkost.setTanggal();
        Thread.sleep(3000);
        dkost.setMonthly();
        Thread.sleep(3000);
        dkost.clickPilihTipeKost();
        Thread.sleep(3000);
        psewa.clickAjukanSewa();
        Thread.sleep(3000);
        psewa.clickOk();
    }
}
