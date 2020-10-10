package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features04", 
glue = { "ex09_stepdefinition_tags" }, plugin = { "pretty" }
//, tags = {"@SmokeTest, @RegressionTest" }//this will execute both
//, tags = {"@SmokeTest" }//this will @SmokeTest
//, tags = {"@RegressionTest" }//this will @SmokeTest
//, tags = {"@RegressionTest, @SmokeTest" }//this will execute both

//, tags = {"@SmokeTest", "~@RegressionTest" }//this will SmokeTest
//, tags = {"@SmokeTest ~@RegressionTest" }//this will SmokeTest
//, tags = {"~@SmokeTest @RegressionTest" }//this will RegressionTest
, tags = {"~@SmokeTest", "@RegressionTest" }//this will RegressionTest


)

public class TestRunner_09_tags {

}
