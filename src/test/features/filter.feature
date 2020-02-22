Feature: Filter
  as an end user
  I want to apply filter
  So that i can find desired product

  Scenario: Filter by review
    Given I am on homepage
    When I search for product "nike"
    And I apply filter review "4 or more"
    Then I should be able to see refined results review "4 or more"
