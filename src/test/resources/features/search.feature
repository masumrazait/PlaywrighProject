Feature: Amazon Search

  Scenario: Search the product
    Given I have a search the field on amazon page
    When I search for a product with name "mobile" and price 1000
    Then product with the name "mobile" should be display


