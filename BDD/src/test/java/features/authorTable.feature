Feature: author list

  @authorTable
  Scenario: test table
    Given a list of authors in a table
      | firstName   | lastName | birthDate  |
      | Annie M. G. | Schmidt  | 1911-03-20 |
      | Roald       | Dahl     | 1916-09-13 |
      |  [blank]    | spnal     | 2222-22-22    |