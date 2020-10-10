package ex08_01_stepdefinition_hooks_BeforeAndAfter;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Configuration;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	String blogTitle;

	@Before()
	public void setUp() throws Exception {
		driver = Configuration.createChromeDriver();
		driver.get(Configuration.ADMIN_URL);
		Thread.sleep(3000);
		driver.findElement(By.name("log")).sendKeys(Configuration.USER_NAME);
		driver.findElement(By.name("pwd")).sendKeys(Configuration.PASSWORD);
		driver.findElement(By.name("pwd")).submit();
		Thread.sleep(3000);

		boolean dboardLoaded = driver.findElement(By.id("wpadminbar")).isDisplayed();
		Assert.assertTrue(dboardLoaded);

	}

	@When("Navigate to Settings page")
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

	@After()
	public void tearDown() {
		driver.quit();

	}

}
