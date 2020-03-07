Feature: Filter
  as an end user
  I want to apply filter
  So that i can find desired product

  Scenario: Filter by review
    Given I am on homepage
    When I search for product "nike"
    And I apply filter review "4or more"
    Then I should be able to see refined results review "2"

   Scenario: Filter by Colour
      Given I am on homepage
      When I search for product "steam iron"
      And I apply filter price "£20 - £25"
      Then I should be able to select price "£20 -£25"

      Scenario: Filter by Brand
        Given I am on homepage
        When I search for product "steam iron"
        And I apply filter by brand "Tefal"
        Then i should be able to select "Tefal"