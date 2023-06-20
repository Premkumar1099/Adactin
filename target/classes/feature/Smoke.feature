
@login @Regression
Feature: Facebook Login Functionality

Background:
Given User Launch the chrome browser
And User Navigate to the fb url "https://www.facebook.com/"


@tc-101 @demo
Scenario: User Login With valid Details
Then User Verify Fb logo
And User Enter Valid Email "tester@gmail.com"
And User Enter Valid Password "87492734927"
Then User Click the Login Button
Then User verified login sucessfull

@tc-102
Scenario Outline: User Login With Invalid Details
Then User Verify logo
And User Enter EmailID <EmailID>
And USer Enter Password <Password>
And User Click the login Button
Then User Verify Error Message "Your email or password is incorrect!"

Examples:
|EmailID|Password|
|"Tester@gmail.com"|"Valid Password"|
|"Tester@gmail.com"|"Invlaid Password"|
|"Tester@gmail.com"|"Invlaid Password"|

@tc-103
Scenario Outline: User Login With Invalid Details
Then User Verify Fb logo
And User Enter Valid Email "tester@gmail.com"
And User Enter Valid Password "87492734927"
And User Test Line -1
And User Test Line -2


 