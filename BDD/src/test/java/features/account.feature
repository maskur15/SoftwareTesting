Feature: Account

  @account
  Scenario Outline:Add amount
    When I transfer $<amount> from account "123456" to account "654321"
    Then Account has $<amount> on account
    Examples:
    |amount|
    |300   |
    |33    |
