package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features01", glue = { "ex05_stepdefinition_Plugins" }, 
plugin = { "pretty", // additional																												// information
		"html:report", // create an index.html in reports folder
		"json:report/cucumber.json", // create a json in reports folder
		"junit:report/cucumber.xml" // create xml in reports folder
})

public class TestRunner_05_PlugIns {

}
