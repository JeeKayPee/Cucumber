package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/Features01", 
glue = { "ex07_stepdefinition_options" }, 
plugin = { "pretty" } //show feature name, scenario name, tabular format
,dryRun=false
//Strict
, strict=true //This is the default - missing implement in console and failed test
//, strict=false //missing implementation in console - don;t fail the test

//Monochrome
//,monochrome=true
//,monochrome=false //default value

//Snippit
// ideally, snippit option should be selected when we create the steps def file
// for the first time. 
// however for improving readabilty, we can use it later as well
// Cucumber accepts either notation in steps (including mixed notation)


//,snippets=SnippetType.UNDERSCORE 
,snippets=SnippetType.CAMELCASE
		)

public class TestRunner_07_options {

}
