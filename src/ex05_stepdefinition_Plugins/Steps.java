package ex05_stepdefinition_Plugins;

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
		// Write code here that turns the phrase above into concrete actions
		driver = Configuration.createChromeDriver();
		driver.get(Configuration.ADMIN_URL);
		System.out.println("Chrome is launched and WordPress admin is opened");
	}

	@When("I Enter the correct User Name and Password")
	public void i_Enter_the_correct_User_Name_and_Password() {
		driver.findElement(By.name("log")).sendKeys(Configuration.USER_NAME);
		driver.findElement(By.name("pwd")).sendKeys(Configuration.PASSWORD);
		System.out.println("I Enter the correct User Name and Password");
	}

	@When("Click on the Login button")
	public void click_on_the_Login_button() throws Exception {
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
		System.out.println("Click on the Login button");
	}

	@Then("it shows the dashboard")
	public void it_shows_the_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		boolean dboardLoaded = driver.findElement(By.id("wpadminbar")).isDisplayed();
		Assert.assertTrue(dboardLoaded);
		System.out.println("it shows the dashboard");
	}

}
