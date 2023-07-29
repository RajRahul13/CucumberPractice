package stepdefinitions.cucumber;

import io.cucumber.java.en.*;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on login page");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("user enters valid username and password");
	}

	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks on submit button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is navigated to homepage");
	}
}
