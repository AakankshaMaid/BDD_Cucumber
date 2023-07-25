Feature: Login functionality with data
Scenario: Login with correct credentials
Given User is at Login page
When User enters the username as "testUsername"
And User enters the password as "password"
And User click on login button
Then User should redirect to homepage


