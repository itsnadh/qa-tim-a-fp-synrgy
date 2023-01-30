package appium.stepDef;

import appium.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import appium.BaseTest;
import appium.page.LoginPage;

public class LoginDef extends BaseTest {
    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();

    @Given("User is on Login page")
    public void onLoginPage() {
        lp.validateOnLoginPage();
        System.out.println("User is on Login page");
    }

    @When("User input Username {string}")
    public void inputUsername(String email) {
        lp.inputEmail(email);
        System.out.println("User input Username");
    }

    @And("User input Password {string}")
    public void inputPassword(String password) {
        lp.inputPassword(password);
        System.out.println("User input Password");
    }

    @And("User click Login button")
    public void clickLoginBtn() {
        lp.clickLoginBtn();
        System.out.println("User click Login button");
    }

    @Then("User is on Home page")
    public void onHomePage() {
        hp.onHomePage();
        System.out.println("User is on Home page");
    }


    @Then("User see failed to login message")
    public void errorMessageShow() {
        //nanti validasi error msg di sini
    }
}