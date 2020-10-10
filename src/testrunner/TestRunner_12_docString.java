package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features07", glue = { "ex12_stepdefinition_docString" }, plugin = { "pretty" }

)

public class TestRunner_12_docString {

}
