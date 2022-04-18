Feature: Verify user login

  Background: Login Page
    Given user is on the login page

  @smoke
  Scenario Outline: User should be able to login with valid credentials
    When "<user>" logs in
    Then user should be on "Product" page

      Examples:
        |         user          |
        |  username_standard    |
        |  username_problem     |
        |  username_performance |

  @smoke
  Scenario Outline: User should not be able to login with invalid credentials or locked account
    When "<user>" logs in
    Then user should see "<error message>"

      Examples:
        |         user          |                          error message                                  |
        |   username_locked     |     Epic sadface: Sorry, this user has been locked out.                 |
        |    wrong_username     |Epic sadface: Username and password do not match any user in this service|
