Feature: WebOrders login functionality

  Background:
    Given the user navigate to the web orders page

  @positive @smoke
  Scenario: WebOrders login positive testing 1

    When the user provide valid username
    And the the user provide valid password
    Then the user should see home page

    @negative @smoke
  Scenario: WebOrder login negative testing

    When the user provide username "Test"
    And the the user provide password "admin"
    Then the user validate text "Invalid Login or Password."

      @negative
  Scenario: WebOrder login negative testing with number

    When the user provide username 12334
    And the the user provide password 1234
    Then the user validate text "Invalid Login or Password."

        @negative
  Scenario: WebOrder login negative testing 2

    When the user provide username "Test" and password "tt"
    Then the user validate text "Invalid Login or Password."

          @menuList
  Scenario: WebOrders menu positive testing 2
    Then user validate menu list