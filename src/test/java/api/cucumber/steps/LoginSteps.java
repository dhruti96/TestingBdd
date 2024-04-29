package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("userIsOnLoginPage");
        System.out.println("Edited from the repo");
    }

    @When("User enters the username and password")
    public void userEntersTheUsernameAndPassword() {
        System.out.println("userEntersTheUsernameAndPassword");
    }

    @And("Click on the login button")
    public void clickOnTheLoginButton() {
        System.out.println("clickOnTheLoginButton");
    }

    @Then("User is navigated to the home page")
    public void userIsNavigatedToTheHomePage() {
        System.out.println("userIsNavigatedToTheHomePage");
    }
}
