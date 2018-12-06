@mobile-regression @mobile-login @mobile
Feature: Mobile Login Feature

  @mobile-1-tutorial-swipe
  Scenario: Verify user should be able to slide right on tutorial pages
    When I swipe right 3 times on tutorials slides
    Then I verify Continue button is displayed