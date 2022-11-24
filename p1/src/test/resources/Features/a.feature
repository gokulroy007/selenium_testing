Feature: working on amazon page

  Scenario: amazon page
    Given user is in amazon page
    When user needs to select dropdown element and searches text
    Then user needs to click on search button
    And user is navigate to homepage
