package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.junit.Assert;

// Given I have opened the application
// When I put in valid credentials
// And click Login
// Then I should see my personalize home page
// Then something else should happen
// And something else should happen
// And I should see my account number
// Scenario: NotImplementedPath
//        Given I have opened the application
//        When I put in valid credentials
//        And click Login
//        Then I should see my personalize home page
//        And Something else happens
public class AuthenticationSteps {

    @Given("^I have opened the application$")
    public void i_have_openend_the_application() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I put in valid credentials$")
    public void i_put_in_valid_credentials() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @And("^click Login$")
    public void click_login() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^I should see my personalize home page$")
    public void i_should_see_my_personalize_home_page() throws Throwable {
        Assert.assertEquals(true, true);
    }
    
    @And("^I should see my account number$")
    public void i_should_see_my_account_number() throws Throwable {
        Assert.assertEquals(true, true);
    }
    @And("^And Something else happens$")
    public void and_something_else_happens() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
