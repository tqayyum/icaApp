@mobile-regression @mobile-login @mobile
Feature: Mobile Login Feature

  Background:
    Given I am on a home page of the app

  @mobile-1-tutorial-swipe
  Scenario: Verify user should be able to slide right on tutorial pages
    When I swipe right 3 times on tutorials slides
    Then I verify Continue button is displayed

  @mobile-2-filter-options
  Scenario: User should be able filter options
    When I click on filter button
    And I disable "Angular" option
    And I click on All Reset Filer button
    Then I verify all options are enabled