Feature: Order information

Background:   
Given user should be logged in
When user clicks on orders link


Scenario: Priviously placed order information
And user click on past order button
Then user should able to see past orders

Scenario: current order information
And user clicks on current order button
Then user should able to see current orders



