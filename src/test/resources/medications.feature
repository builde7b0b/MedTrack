Feature: Medications API
  Scenario: Creating a new medication
    Given I have a valid medication payload
    When I send a POST request to "/medications"
    Then the response status code should be 201
    And the response should contain the created medication detail

