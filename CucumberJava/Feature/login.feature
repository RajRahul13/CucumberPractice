@SmokeFeature
Feature: Login page Functionality
	@SmokeTest
  Scenario: when user passes vaild username and password
    Given user is on login page
    When user enters valid username and password
    And user clicks on submit button
    Then user is navigated to homepage

