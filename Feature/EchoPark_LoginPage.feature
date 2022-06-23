Feature: EchoPark LoginPage validation

Scenario: EchoPark Login with valid credentials
	Given User launched web browser
	When User opens EchoPark URL "https://qa.shipwithechopark.com/auth/login"
	And User enters Email as "wl-sales@metrogistics.com" and Password as "P@$$word1"
	Then Clicks on Login button
	Then Page Titile should be "Driversselect :: Home"
	And User clicks on Logout button
	Then Page Title should be "Ship With Echopark - Login"
	And User closes the browser

Scenario Outline:EchoPark Login with multiple invalid credentials
	Given User launched web browser
	When User opens EchoPark URL "https://qa.shipwithechopark.com/auth/login"
	And User enters Email as "<email>" and Password as "<password>"
	Then Clicks on Login button
	Then Page Titile should be "Driversselect :: Home"
	And User clicks on Logout button
	Then Page Title should be "Ship With Echopark - Login"
	And User closes the browser
	
Examples:
|email|password|
|wl-sales@metrogistics.com|P@$$word1|
|wl-sales@metrogistics.com|P@$$word2|
|wl-sales@metrogistics.com|P@$$word3|
|wl-sales@metrogistics.com|P@$$word4|
|wl-sales@metrogistics.com|P@$$word5|
