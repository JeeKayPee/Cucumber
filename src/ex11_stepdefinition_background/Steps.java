package ex11_stepdefinition_background;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("Chrome Browser is launched")
	public void chrome_Browser_is_launched() {
		driver = Configuration.createChromeDriver();
	}

	@When("I have logged into the Wordpress Admin")
	public void i_have_logged_into_the_Wordpress_Admin() throws Exception {
		driver.get(Configuration.ADMIN_URL);
		driver.findElement(By.name("log")).sendKeys(Configuration.USER_NAME);
		driver.findElement(By.name("pwd")).sendKeys(Configuration.PASSWORD);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(2000);
		boolean dboardLoaded = driver.findElement(By.id("wpadminbar")).isDisplayed();
		Assert.assertTrue(dboardLoaded);
	}

	@Given("Navigate to Settings page")
	public void navigate_to_Settings_page() {
		driver.findElement(By.linkText("Settings")).click();
	}

	@When("Change the Site title")
	public void change_the_Site_title() {
		WebElement siteTitle = driver.findElement(By.id("blogname"));
		siteTitle.clear();
		siteTitle.sendKeys(Configuration.BLOG_TITLE);
		driver.findElement(By.id("submit")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Settings saved.']")).isDisplayed());

	}

	@Then("The title of the site should be changed")
	public void the_title_of_the_site_should_be_changed() {
		String xFinder = String.format("//a[text()='%s']", Configuration.BLOG_TITLE);
		WebElement navSite = driver.findElement(By.xpath(xFinder));
		String actualTitle = navSite.getText();
		assertEquals(Configuration.BLOG_TITLE, actualTitle);
	}

	@When("Change the Week Starts on to Monday")
	public void change_the_Week_Starts_on_to_Monday() {
		WebElement rawDropDown = driver.findElement(By.id("start_of_week"));
		rawDropDown.sendKeys(Configuration.WEEK_STARTS);
	}

	@Then("The Week Starts on should be changed")
	public void the_Week_Starts_on_should_be_changed() {
		String xFinder = String.format("//option[text()='%s']", Configuration.WEEK_STARTS);
		WebElement option = driver.findElement(By.xpath(xFinder));
		Assert.assertTrue(option.isSelected());
	}

}
