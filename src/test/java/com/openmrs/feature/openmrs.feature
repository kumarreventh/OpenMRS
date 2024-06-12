Feature: Patient Management Workflow

  Scenario: Complete Patient Management Workflow
    Given I am on the OpenMRS login page
    When I enter username and password
    And I pick a location and click on Login
    Then I should be redirected to the dashboard page

    When I click on Register a patient menu
    And I enter the patient demographics with name, genderand birthdate
    And I enter the contact information with address and phone number
    And I proceed to the confirm page
    Then the demographics and contact information should be populated correctly
    When I click on Confirm
    Then I should be redirected to the Patient Details page
    And the patient age should be calculated correctly based on the birthdate provided

    When I click on Start Visit and confirm the visit
    And I click on Attachment and complete the upload process
    Then a success toaster message should appear for the successful attachment
    And I should be redirected to the Patient Details screen
    And the Attachment section should have the uploaded attachment
    And the Recent Visit should have one entry for the current date with the Attachment Upload tag

    When I click on the End Visit action at the RHS
    And I start a visit again and click on Capture Vitals menu
    And I enter height and weight
    Then the displayed BMI should be calculated correctly using the BMI formula
    When I click on Save Form and Save button
    And I click on End Visit and redirect to the Patient Details page
    Then the given height and weight should be displayed correctly along with the calculated BMI
    And the Recent Visit should have one more new entry for the current date with the Vitals tag

    When I click on Merge Visits, select the two visits and click on Merge Selected Visits button
    And I redirect to the patient details page by clicking on the Return button
    Then the Recent Visit should have one entry for the current date with the Vitals and Attachment Upload tags

    When I click on Add Past Visit and verify the future date is not clickable in the date picker
    And I redirect to the patient details page
    And I click on Delete Patient and provide the reason
    And I click on confirm button
    Then a success toaster message should appear
    And I should be redirected to the Find Patient Record menu
    And the deleted patient should not be listed in the table using search options 
