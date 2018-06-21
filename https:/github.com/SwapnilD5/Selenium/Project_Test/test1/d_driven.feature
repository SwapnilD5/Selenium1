Feature: Login Action
 
Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfullys
	
	
Examples:
|username| |password|
|demo1| |demo1|
|demo2| |demo2|