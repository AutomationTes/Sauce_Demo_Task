package com.sauceDemo.step_definitions;

import com.sauceDemo.pages.LoginPage;
import com.sauceDemo.utilities.ConfigurationReader;
import com.sauceDemo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
    }

    @When("{string} logs in")
    public void logs_in(String username) {
        loginPage.login(username);
    }

    @Then("user should see {string}")
    public void user_should_see_error_message(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage,actualErrorMessage);
    }
}
