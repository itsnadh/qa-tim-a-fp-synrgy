package appium.stepDef;

import appium.page.ForgotPasswordPage;
import appium.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import appium.BaseTest;
import appium.page.LoginPage;
import appium.page.WelcomePage;
import appium.page.ForgotPasswordPage;

public class ForgotPasswordDef extends BaseTest {
    WelcomePage wp = new WelcomePage();
    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();
    ForgotPasswordPage fp = new ForgotPasswordPage();

    @And("User click Lupa Password")
    public void lupaPassword() {
        lp.clickForgotPass();
    }

    @And("User is on Lupa Password page")
    public void onLupaPasswordPage() {
        fp.validateOnLupaPasswordPage();
    }

    @And("User input Email {string} on form")
    public void inputEmail(String email) {
        fp.inputEmail(email);
    }

    @And("User click Kirim Link Reset button")
    public void clickKirimLinkBtn() {
        fp.clickSendLinkBtn();
    }

    @And("User see success message")
    public void successMsg() {
        System.out.println("success message pop up");
    }
}
