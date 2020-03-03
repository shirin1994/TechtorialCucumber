Feature: this is for web order all products
  @order @smoke
  Scenario: this validation of all product data
    Given the user navigate to the web orders page
    When the user provide valid username
    And the the user provide valid password
    Then the user click view all product button
    And the user validate product table