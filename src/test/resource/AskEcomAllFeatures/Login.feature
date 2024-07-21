Feature: Login


Scenario: Verify User Login

Given Open ecommerce application "<URL>" 
When User click Account link
And User enter username and password and click log in
Then Verify user login successfully
