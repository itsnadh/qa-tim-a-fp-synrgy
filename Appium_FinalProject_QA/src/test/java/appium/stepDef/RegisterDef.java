package appium.stepDef;

import appium.page.HomePage;
import appium.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import appium.BaseTest;
import appium.page.RegisterPage;

public class RegisterDef extends BaseTest {
    RegisterPage rp = new RegisterPage();
    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();

    @Given("User is on Register page")
    public void onRegisterPage() {

    }

    @When("User input First Name {string}")
    public void inputRegFirstName(String firstName) {
        rp.inputRegFirstName(firstName);
    }

    @And("User input Last Name {string}")
    public void inputRegLastName(String lastName) {
        rp.inputRegLastName(lastName);
    }

    @And("User input Phone Number {string}")
    public void inputRegPhoneNumber(String phoneNumber) {
        rp.inputRegPhoneNumber(phoneNumber);
    }

    @And("User input Email {string}")
    public void inputRegEmail(String email) {
        rp.inputRegEmail(email);
    }

    @And("User input Password {string}")
    public void inputRegPassword(String password) {
        rp.inputRegPassword(password);
    }

    @And("User input Confirm Password {string}")
    public void inputRegConfirmPassword() {
        rp.inputRegConfirmPassword(null);
    }

    @And("User click Register button")
    public void clickRegisterBtn() {
        rp.clickRegisterBtn();
    }
}
