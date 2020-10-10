package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) // JUnit 4
//@ExtendWith(Cucumber.class) //Junit 5

@CucumberOptions(features = "Features/Features01", glue = { "ex03_01_stepdefinition_intro" })

public class TestRunner_03_01_introduction {

}
