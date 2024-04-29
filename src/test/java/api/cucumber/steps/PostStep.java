package api.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostStep {
    @Given("User should be logged in and present on his wall")
    public void userShouldBeLoggedInAndPresentOnHisWall() {
        System.out.println("userShouldBeLoggedInAndPresentOnHisWall");
        System.out.println("Hello World");
    }

    @When("I type the message in the text box")
    public void iTypeTheMessageInTheTextBox(){
        System.out.println("iTypeTheMessageInTheTextBox");
    }

    @And("click on post button")
    public void clickOnPostButton(){
        System.out.println("clickOnPostButton");
    }

    @Then("the message should get posted")
    public void theMessageShouldGetPosted(){
        System.out.println("theMessageShouldGetPosted");
    }
}
