Feature: Download pdf from wikipedia
  As a user I want to download pdf
  As a ueser I want to find the page information

  Background:
    Given I'm on the main page
    Then Main page is displayed

  @normal
  Scenario: download pdf
    When Input "Albert Einstein" text in the search field and click submit button
    And Click Tool menu button and Download as PDF button on the Article page
    And Download file from Download as PDF page
    Then File with the name provided on Download as PDF page is downloaded

  @normal
  Scenario: page information
    When Input "Bengal tiger" text in the search field and click submit button
    When Click Tool menu button and Page information button on the Article page
    Then Information page for "Bengal tiger" article is displayed