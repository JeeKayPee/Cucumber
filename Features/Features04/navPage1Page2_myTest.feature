Feature: App Navigation
@SmokeTest
	Scenario: Successful navigation to page one
		When I click on the first link
		Then It shows the first page
@RegressionTest	
	Scenario: Successful navigation to page two
		When I click on the second link
		Then It shows the second page
	