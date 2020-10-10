package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = "Features/Features01", glue = { "ex04_stepdefinition_Selenium" })

public class TestRunner_04_Selenium {

}
