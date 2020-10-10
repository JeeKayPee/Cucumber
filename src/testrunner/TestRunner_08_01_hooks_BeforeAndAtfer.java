package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features02", 
glue = { "ex08_01_stepdefinition_hooks_BeforeAndAfter" })

public class TestRunner_08_01_hooks_BeforeAndAtfer {

}
