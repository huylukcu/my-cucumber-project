@google_search
Feature: first feature file
  Background: user is on the google home page

  @iphone_search
  Scenario:  TC_01_first_scenario
    Given user is on the google home page
    When user search for iPhone
    Then verify page title contains iPhone
    Then close the application

  @teapot_search
  Scenario: TC_02_teapot_search
   When user search for TeaPot
   Then verify page title contains TeaPot
