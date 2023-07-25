Feature: Login functionality
Scenario: Login with correct credentials
Given User is at the login screen
When User enters username
And User enters password
And User click on  button
Then User should see the homepage


Scenario: Validate title
Given User is at the login screen
Then page title should get display
