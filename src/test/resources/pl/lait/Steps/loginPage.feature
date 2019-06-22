Feature: Login page test

Scenario: Open main page and click in the top bar links
Given I open main page 
When I click SIGN-ON link
Then I should see the login page 


Scenario: Fill the reservation form
Given I open main page 
When I click SIGN-ON link
Then I should see the login page 
When I log in as "knight86" with password "stefan"
And I fill one passenger flight
And From flight: "Frankfurt" at day "10" month "7"
And To flight: "Paris" at day "11" month "7"
And Close the browser