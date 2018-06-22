Feature: To open on multiple browser

@tag1
Scenario: open on chrome
Given Open browser chrome
When enter url for chrome
Then application should get open in chrome


@tag2
Scenario: open on firefox
Given Open browser firefox
When enter url for firefox
Then application should get open in firefox

