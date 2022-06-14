#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Registration functionality
  As a new user, After provide all required information user should be able to register the application


  Scenario Outline: Positive Registration functionality test
  Given user is in registration page
  When user provide all required information "<firstname>"and "<lastname>"
  Then user added "<username>" 
  And user added "<password>"and "<confirmpassword>"
  And clicks Submit button
  Then user should be registered
  And user should see registration completed message
   Examples:
 | firstname | lastname | username | password | confirmpassword |
 | tom       | tm       | test12   |123        |123             |
 | thomas    |th        | test12   |123        |123             |  
 

