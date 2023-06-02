Feature: Inventory Management

  Scenario: View current inventory levels
    Given I am a pharmacy manager
    When I access the inventory management system
    Then I should be able to view the current inventory levels

  Scenario: Receive automated low stock alerts
    Given I am a pharmacy manager
    When the inventory management system detects low stock for a medication
    Then I should receive an automated alert notification

  Scenario: Receive automated expiration date alerts
    Given I am a pharmacy manager
    When the inventory management system detects medications approaching their expiration dates
    Then I should receive an automated alert notification