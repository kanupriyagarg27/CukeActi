Feature: Create customer on TaskPage
Scenario: Actions on Task page to create customer
	  Then Task list page should be displayed
    When User clicks on add new button
    Then User selects the option new customer
    When User enters customer name in the text box
    And User enters description in the description box
    And User clicks on the create button
    Then User validate customer is created
    Then User logs out of the application
	