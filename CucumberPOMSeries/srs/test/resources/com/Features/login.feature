Feature: Login page Feature

Scenario: Login page title
Given user is on login page
When user gets the title page
Then page title should be "Login - My Store"

Scenario: Forgot password link
Given user is on login page
Then forgot password page should be displayed

Scenario: Login with valid credentials
When user enters username
|username|

And user eters password
|password|

Then user clicks on Login button
