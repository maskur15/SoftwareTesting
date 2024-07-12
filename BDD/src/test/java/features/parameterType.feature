Feature: parameter type

  Scenario: parameter
    Given I want to add a book titled "The 1984" with a publication date of 1949-06-08

  @parameter
  Scenario: Validate birth date
    Given "Albert Einstein" birth day is 1924-12-20