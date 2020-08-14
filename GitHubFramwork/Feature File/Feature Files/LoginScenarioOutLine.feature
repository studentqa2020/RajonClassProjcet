@Smoke 
Feature: Automation practice login feature scenario outline
	Description : note about your requirement

Scenario Outline: As a user , i can login successfully with valid user name and password 
	Given open a browser and send url 
	And Put URL "<URL>" from below example table
	When Click Signin button
	And put valid user name "<userName>" from below table
	And put valid password "<passWord>" from below table
	And click sign in 
	Then Validate login pass or fail
Examples:
	|URL									|userName			|passWord|
	|http://automationpractice.com/index.php|sarowerny@gmail.com|student | 
	|http://automationpractice.com/index.php|sarowerny@gmail.com|student | 
	|http://automationpractice.com/index.php|sarowerny@gmail.com|student | 

