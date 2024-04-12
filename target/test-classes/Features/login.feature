Feature: Login page Automation of Saucedemo application
Scenario: Check login is successful with valid creds

Given User is on login page
When User enter valid username and passwrd
And Click on login button
Then User should be navigate to homepage
And Close the browser