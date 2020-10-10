Feature: Functionality on Login page of application
	Scenario: Verification of Login Functionality
		Given Chrome is launched and WordPress admin is opened
		When I Enter the correct User Name and Password
		And Click on the Login button
		Then it shows the dashboard