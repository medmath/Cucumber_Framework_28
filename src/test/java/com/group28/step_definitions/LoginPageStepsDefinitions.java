package com.group28.step_definitions;

import com.group28.utilities.ConfigurationReader;
import com.group28.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepsDefinitions {

    @When("Given user is on the login page")
    public void given_user_is_on_the_login_page() {
        System.out.println("I am opening the login page");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String string, String string2) {

    }

    @Then("message should be {string}")
    public void message_should_be(String string) {

    }

    @When("user goes to Lunch page")
    public void user_goes_to_Lunch_page() {

    }

    @Then("user should be able to see the message {string}")
    public void user_should_be_able_to_see_the_message(String string) {

    }

    @When("user click on the button {string}")
    public void user_click_on_the_button(String string) {

    }

    @Then("the title should be {string}")
    public void the_title_should_be(String string) {

    }

}


