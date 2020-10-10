Feature: Allow visitors to post comments, once a post is created 
Scenario: Fill in comment form 
	Given A post has been created 
	When The admin has logged off 
	Then A "Katrina Kaif" with "Katrina@Kaif.com" must be able to add a comment with: 
		"""
		Dear, 
		It's been more than a week, I have not heard from you
		"""