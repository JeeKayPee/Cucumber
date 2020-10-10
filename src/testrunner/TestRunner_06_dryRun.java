package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features01", glue = { "ex06_stepdefinition_dryRun" },

//dryRun=true //execute the method names only
		dryRun = false // execute the implementation of methods - this is default value

)

public class TestRunner_06_dryRun {

}
