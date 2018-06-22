@TC01
Feature: To Test functionality of Login.

Scenario: To test Login functionality with valid data.

Given Mercury Tours Application should get open.
When user enter valid id and password
Then home page should get open
And Verify title
Then Close application


