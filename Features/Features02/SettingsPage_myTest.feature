Feature: App Navigation 
Scenario: Changing the Site Title 
	Given Navigate to Settings page 
	When Change the Site title 
	Then The title of the site should be changed 
	
Scenario: Changing the Weeks Starts on 
	Given Navigate to Settings page 
	When Change the Week Starts on to Monday 
	Then The Week Starts on should be changed 
	