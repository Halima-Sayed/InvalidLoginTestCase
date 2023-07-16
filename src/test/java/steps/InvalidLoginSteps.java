package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class InvalidLoginSteps extends CommonMethods {
    @Given("user is navigated to HRMS applicationt")
    public void user_is_navigated_to_hrms_applicationt() {
        openBrowserAndNavigateToURL();
    }
    @When("user enters {string} and {string} and verifying the {string} for the combinations")
    public void user_enters_and_and_verifying_the_for_the_combinations(String username, String password, String expectedMsg) {
        sendText(username, loginPage.usernameField);
        sendText(password, loginPage.passwordField);
        click(loginPage.loginButton);
        //fetching the error message from the web element
        String errorMessageActual = loginPage.errorMessageField.getText();
        //error message coming from feature file too which we can compare
        Assert.assertEquals("value does not match", expectedMsg, errorMessageActual);
    }
}
