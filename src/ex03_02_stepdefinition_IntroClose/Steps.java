package ex03_02_stepdefinition_IntroClose;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("Chrome is launched and WordPress admin is opened")
	public void chrome_is_launched_and_WordPress_admin_is_opened() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Chrome is launched and WordPress admin is opened");
	}

	@When("I Enter the correct User Name and Password")
	public void i_Enter_the_correct_User_Name_and_Password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I Enter the correct User Name and Password");
	}

	@When("Click on the Login button")
	public void click_on_the_Login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Click on the Login button");
	}

	@Then("it shows the dashboard")
	public void it_shows_the_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("it shows the dashboard");
	}

}
