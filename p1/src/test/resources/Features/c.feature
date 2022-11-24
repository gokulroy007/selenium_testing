Feature: working with an amazon page

  Scenario: web application
    Given an amzon page and opening an amazon page
    When page is opened
    Then capture all links
    And close the browser
