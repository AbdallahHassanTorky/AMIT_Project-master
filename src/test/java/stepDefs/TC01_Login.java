package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class TC01_Login {

    pages.TC01_Login login = new pages.TC01_Login();


    //Positive
    @And("user login with valid {string} and {string}")
    public void userLoginWithValidAnd(String Email, String Password) {
        login.email().sendKeys(Email);
        login.password().sendKeys(Password);
    }
    //Negative
    @And("user logs in with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String Email, String Password) {
        login.email().sendKeys(Email);
        login.password().sendKeys(Password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void UserLoginToTheSystemSuccessfully() {

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {

        SoftAssert soft = new SoftAssert();
        soft.assertEquals(login.WrongMessage().getText(),"Epic sadface: Username and password do not match any user in this service");
        soft.assertAll();
    }

}
