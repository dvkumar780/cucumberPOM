Background:

Given user already logged in to application
|username|password|
|binvinay@gmail.com||vinnu001|

Scenario: Account page title
Given user is on Account page
Then page title should be Login - My Store
