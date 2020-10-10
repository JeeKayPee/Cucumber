package ex08_02_stepdefinition_hooks_Order;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Before(order = 0) //class level fixture
	public void setUp1() {
		System.out.println("0------------------Start of Scenario----------------");
	}
	@Before(order = 1) //method level fixture
	public void setUp2() {
		System.out.println("1 - This will be run before every scenario");
	}
	
	@After(order = 1) //method level fixture
	public void tearDown1() {
		System.out.println("1 - this will be run after every scenario");
	}
	
	@After(order = 0) //class level fixture
	public void tearDown2() {
		System.out.println("0------------------End of Scenario----------------\"");
	}
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
