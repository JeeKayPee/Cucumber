package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = "Features/Features01", glue = { "ex03_02_stepdefinition_IntroClose" })

public class TestRunner_03_02_introClose {

}
