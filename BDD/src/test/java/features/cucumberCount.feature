Feature: Cucumber count

  @cucumber
  Scenario: Adding cucumbers
    Given I have 5 cucumbers in my basket
    When I add 3 cucumbers
    Then I should have 8 cucumbers in total
    When I remove 33939 cucumbers from total
    When I pick "red" cucumber
