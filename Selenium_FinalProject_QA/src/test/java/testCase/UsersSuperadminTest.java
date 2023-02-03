package testCase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.UsersPage;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.testng.AssertJUnit.assertEquals;

public class UsersSuperadminTest {

    WebDriver driver;

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @BeforeTest
    public void setup() throws InterruptedException {
        System.out.println("==========Browser is launching==========");
        driver = WebDriverManager.chromedriver().create();
        driver.get("https://frontend-fsw-testing.vercel.app/login/superadmin");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, SECONDS);

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

    @Test (priority = 1)
    public void getAllUsers() throws InterruptedException {
        UsersPage usersPage = new UsersPage(driver);
        usersPage.showUserList();
        Thread.sleep(2000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/admin/users");
    }

    @Test (priority = 2)
    public void showDetailUser() throws InterruptedException {
        UsersPage usersPage = new UsersPage(driver);
        getAllUsers();
        Thread.sleep(2000);
        usersPage.detailUser();
        Thread.sleep(1000);
        assertEquals(driver.getCurrentUrl(), "https://frontend-fsw-testing.vercel.app/admin/users/1");
    }

    //add new user, change user, and delete user will be checked soon

    @AfterTest
    public void quit(){
        driver.quit();
    }

}
