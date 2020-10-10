package ex12_stepdefinition_docString;

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
	String postURL;

	@Given("A post has been created")
	public void a_post_has_been_created() {
		driver = Configuration.createChromeDriver();
		driver.get(Configuration.ADMIN_URL);

		driver.findElement(By.name("log")).sendKeys(Configuration.USER_NAME);
		driver.findElement(By.name("pwd")).sendKeys(Configuration.PASSWORD);
		driver.findElement(By.name("pwd")).submit();

		driver.findElement(By.linkText("Posts")).click();
		driver.findElement(By.linkText("Add New")).click();

		String expectedTitle = "Sample Title";
		WebElement titleBox = driver.findElement(By.id("title"));
		titleBox.sendKeys(expectedTitle);
		Assert.assertEquals(expectedTitle, titleBox.getAttribute("value"));

		driver.switchTo().frame("content_ifr");

		String expectedtext = "Dummy Text";
		WebElement content = driver.findElement(By.id("tinymce"));
		content.sendKeys(expectedtext);
		Assert.assertEquals(expectedtext, content.getText());

		driver.switchTo().defaultContent();
		driver.findElement(By.id("publish")).click();

		WebElement viewPostLink = driver.findElement(By.linkText("View post"));
		postURL = viewPostLink.getAttribute("href");

	}

	@When("The admin has logged off")
	public void the_admin_has_logged_off() {
		WebElement logout = driver.findElement(By.xpath("//*[text()='Log Out']"));
		driver.get(logout.getAttribute("href"));
		driver.get(postURL);

	}

	@Then("A {string} with {string} must be able to add a comment with:")
	public void a_with_must_be_able_to_add_a_comment_with(String name, String email, String docString)
			throws Exception {
		driver.findElement(By.id("author")).sendKeys(name);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(3000);
		driver.findElement(By.id("comment")).sendKeys(docString);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).submit();
	}
}
