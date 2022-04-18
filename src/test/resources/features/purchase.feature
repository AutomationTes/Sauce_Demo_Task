Feature: Verify purchase functionality

  Background: Login Page
    Given user is on the login page

  @smoke
  Scenario Outline: User should be able to purchase
    And "<user>" logs in
    And user should be on "Product" page
    When user adds 3 items to cart
    And user checkouts on YOUR CART page
    And user completes CHECKOUT:YOUR INFORMATION
    And user FINISHES CHECKOUT
    Then user should be on "checkout-complete" page

      Examples:
        |         user          |
        |  username_standard    |
        |  username_performance |

  @smoke
  Scenario Outline: Problem user should not be able to purchase
    And "<user>" logs in
    And user should be on "Product" page
    When user adds 2 items to cart
    And user checkouts on YOUR CART page
    And user completes CHECKOUT:YOUR INFORMATION
    Then user should see "<error message>"

    Examples:
      |         user          |       error message          |
      |  username_problem     | Error: Last Name is required |