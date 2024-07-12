Feature: Search Language

  @search
  Scenario Outline: search language
    Given I'm on the main page
    Then Main page is displayed
    When Input "<article>" text in the search field, change search language to "English" and click submit button
    Then Article page for "<outcome>" is open

    Examples:
      |article|outcome|
      |Tiger  |Tiger  |
      |Albert |Albert |