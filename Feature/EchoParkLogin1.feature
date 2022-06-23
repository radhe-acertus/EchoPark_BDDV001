@QA-68
Feature: Cucumber-BDD-Demo

	#Creating Cucumber BDD Feature files
	@TEST_QA-67
	Scenario: Cucumber-BDD-Demo
		Scenario: EchoPark Login with valid credentials
			Given User launched web browser
			When User opens EchoPark URL "https://qa.shipwithechopark.com/auth/login"
			And User enters Email as "wl-sales@metrogistics.com" and Password as "P@$$word1"
			Then Clicks on Login button
			Then Page Titile should be "Driversselect :: Home"
			And User clicks on Logout button
			Then Page Title should be "Ship With Echopark - Login"
			And User closes the browser
