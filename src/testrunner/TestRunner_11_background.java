package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features06", 
glue = { "ex11_stepdefinition_background" }, plugin = { "pretty" }

)

public class TestRunner_11_background {

}
