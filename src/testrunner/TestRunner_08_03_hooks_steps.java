package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features03", 
glue = { "ex08_03_stepdefinition_hooks_Order_step" }
, plugin= {"pretty"}
		)

public class TestRunner_08_03_hooks_steps {

}
