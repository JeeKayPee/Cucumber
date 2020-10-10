package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features03", 
glue = { "ex08_02_stepdefinition_hooks_Order" }
, plugin= {"pretty"}
		)

public class TestRunner_08_02_hooks_Order {

}
