@youtube
Feature: youtube search feature
  Scenario: testing youtube search
    Given user is on the youtube homepage
    And user is able to see the search box
    And user is able to see the search button
    When user searches for FUNNY CAT VIDEOS
    Then user should see results related to funny cat videos


