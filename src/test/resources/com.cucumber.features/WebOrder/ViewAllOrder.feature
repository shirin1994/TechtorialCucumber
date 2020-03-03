Feature: View all order list
  @orders
  Scenario: WebOrders login positive testing 1
    Given the user navigate to the web orders page
    When the user provide valid username
    And the the user provide valid password
    Then the user should see home page

  Scenario: Validate header
    Then validate list of all order displayed