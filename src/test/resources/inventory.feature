Feature: Inventory Management

  Scenario: View current inventory levels
    Given I am a pharmacy manager
    When I access the inventory management system
    Then I should be able to view the current inventory levels