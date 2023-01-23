Feature: This feature is for login functionality 



@login
Scenario: Verify user can login with calid credentials 
Given MetaLaunch "<URL>"
Then Click Login link
Then Enter Username and Password and Click Login button
Then Verify user can login with valid credentials 