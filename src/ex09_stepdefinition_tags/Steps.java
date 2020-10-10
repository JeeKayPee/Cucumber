package ex09_stepdefinition_tags;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	
	
	@When("I click on the first link")
	public void i_click_on_the_first_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When 1 - I click on the first link");
	}

	@Then("It shows the first page")
	public void it_shows_the_first_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then 1 - It shows the first page");
	}

	@When("I click on the second link")
	public void i_click_on_the_second_link() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("When 2 - I click on the second link");
	}

	@Then("It shows the second page")
	public void it_shows_the_second_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Then 2 - It shows the second page");
	}

}
