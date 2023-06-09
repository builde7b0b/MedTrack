#Feature: Medications API
#  Scenario: Creating a new medication
#    Given I have a valid medication payload
#    When I send a POST request to "/medications"
#    Then the response status code should be 201
#    And the response should contain the created medication detail
#


  # Scenario: Updating a Medication
  # Given A Medication exist in the Medications
  # When I send a PUT request to "/medications/medicationId"
  # Then the response status code should be 201
  # And the response should contain a message that the medication has been deleted

  # Scenario: Deleting a Medication
  # Given A Medication exist in the Medications
  # When I send a DELETE request to "/medications/medicationId"
  # Then the response status code should be 201
  # And the response should contain a message stating that the medication has been deleted