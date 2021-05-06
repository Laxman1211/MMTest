Feature: Problem #1 test feature 

Scenario: Verify right count of values appear on screen 
	Given User is on Home Page
	When User Navigate to problem Page
	Then Right count of values appear on screen

Scenario: Verify values on screen are greater than Zero
	Given User is on Home Page
	When User Navigate to problem Page
	Then values are greater than Zero

Scenario: Verify total balance is correct based on values listed on screen
	Given User is on Home Page
	When User Navigate to problem Page
	Then Total balance is correct

Scenario: Verify values are formatted as currencies 
	Given User is on Home Page
	When User Navigate to problem Page
	Then Values are formatted as currencies

Scenario: Verify total balance matches sum of values 
	Given User is on Home Page
	When User Navigate to problem Page
	Then Total balance equals to sum of values
	
