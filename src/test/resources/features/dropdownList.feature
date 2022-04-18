Feature: Verify user activity on product page

  Background: Login Page
    Given user is on the login page

  @smoke
  Scenario Outline: User should be able to select options from Menu
    And "<user>" logs in
    When user selects "LOGOUT" from menu
    Then user should be on "LOGIN" page

      Examples:
        |         user          |
        |  username_standard    |
        |  username_problem     |
        |  username_performance |
  @smoke
  Scenario Outline: User should be able to sort items in reverse order Z to A
    And "<user>" logs in
    When user sorts items in reverse order "za"
    Then user should see items are sorted in reverse order Z to A

      Examples:
        |         user          |
        |  username_standard    |
        |  username_performance |
