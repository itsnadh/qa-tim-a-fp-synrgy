package appium.stepDef;

import appium.page.HomePage;
import appium.page.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import appium.BaseTest;
import appium.page.LoginPage;
import appium.page.WelcomePage;

public class LogoutDef extends BaseTest {

    WelcomePage wp = new WelcomePage();
    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();
    ProfilePage pp = new ProfilePage();

    @And ("User click Profile menu")
    public void goToProfile(){
        hp.goToProfile();
    }

    @And ("User is on Profile menu")
    public void onProfileMenu(){
        pp.onProfilePage();
    }

    @And ("User click Log Out button")
    public void clikLogoutBtn(){
        pp.clickLogout();
    }

}
