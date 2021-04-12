Feature: To verify the order list and name change

  Scenario: To verify the order list
    Given I launch the home page of shopping list
    When I order one T-shirt
    Then I verify the summary of order


    Scenario: To verify name change
      Given I login to the shopping page
      When I click my account to change my name
      Then My name should change successfully
