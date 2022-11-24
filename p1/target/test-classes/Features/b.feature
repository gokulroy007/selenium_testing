Feature: web application

  Scenario: working on newtours page
    Given user opens newtours website
    When user need to click register link
    Then user needs to get country name from dropdown
    And user is navigated back to home page
    And user close the browser
