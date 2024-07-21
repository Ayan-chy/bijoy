Feature: Register



Scenario: Verify User Registration

Given Open ecommerce application "<URL>" 
When User click Account link
And User enter username, email address and password and click Register
Then Verify user Register successfully
