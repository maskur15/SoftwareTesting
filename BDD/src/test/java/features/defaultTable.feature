Feature: default table

  @defaultTable
  Scenario: table in cucumber
    Given a list of books in a table
      | book   | lastName | birthDate  |
      |magic | Schmidt  | 1911-03-20 |
      | honei       | Dahl     | 1916-09-13 |
