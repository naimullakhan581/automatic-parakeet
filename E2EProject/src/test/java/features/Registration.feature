Feature: Registration 

Background: User is Sign In Page
Given Initialize the browser with chrome
And Navigate to the url "http://automationpractice.com/index.php"
When User clicks on the Sign in button
Then User is on the Sign page
 

Scenario: User tries to register with already existing email address
Given User enters "test123@gmail.com"
When User clicks on the Create an account button
Then User sees an error message


Scenario: User tries to register with a empty details
Given User enters "testReg123045@gmail.com"
And User clicks on the Create an account button
When User clicks on Register button
Then User sees Registration error messages


Scenario: User tries to register with a new email address
Given User enters "test+Reg123779@gmail.com"
And User clicks on the Create an account button
And User enters the mandatory details:
|fntest |lntest |pwdtest1234 |4800  Blackwell Street |Dry Creek |Alaska |99737 |907-323-6338 |Test Address |
When User clicks on Register button
Then User is successfully registered