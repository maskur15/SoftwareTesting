Feature: page information of wikipedia
  I want to get the page information
  Background:
    Given I'm on the main page
    Then Main page is displayed

  @simple
  Scenario Outline: page information
    When Input "<keyword>" text in the search field and click submit button
    When Click Tool menu button and Page information button on the Article page
    Then Information page for "<outcome>" article is displayed

    Examples:
      |keyword|outcome|
      |Tiger  |Tiger  |
      |Albert |Albert |


