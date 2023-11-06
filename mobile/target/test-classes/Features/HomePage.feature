Feature: Home page features

  Scenario: Home Page title
    Given User is on Home Page
    Then Verify Tile

    Scenario: Home page top menu
    	Given User is on Home Page
    	Then Verify open menu option
    	Then Verify Cart option is clickable