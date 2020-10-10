package ex10_stepdefinition_expressions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("Chrome is launched and WordPress admin is opened")
	public void chrome_is_launched_and_WordPress_admin_is_opened() {
		driver = Configuration.createChromeDriver();
		driver.get(Configuration.ADMIN_URL);
	}

	@When("I Enter the correct {string} and {string}")
	public void i_Enter_the_correct_and(String userName, String password) {
		driver.findElement(By.name("log")).sendKeys(userName);
		driver.findElement(By.name("pwd")).sendKeys(password);
	}

	@When("Click on the Login button")
	public void click_on_the_Login_button() throws Exception {
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
	}

	@Then("it shows the dashboard")
	public void it_shows_the_dashboard() {
		boolean dboardLoaded = driver.findElement(By.id("wpadminbar")).isDisplayed();
		Assert.assertTrue(dboardLoaded);
	}
}
