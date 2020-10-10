package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features05", 
glue = { "ex10_stepdefinition_expressions" }, plugin = { "pretty" }



)

public class TestRunner_10_expressions {

}
