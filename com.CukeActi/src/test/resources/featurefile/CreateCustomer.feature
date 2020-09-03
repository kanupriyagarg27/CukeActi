Feature: Create _Customer feature

  Scenario: User logs in to actime and creates a new user.
      
    Given User navigates to Actitime page
    Then User validates the login page title
    When User enters username as "admin" and password as "manager"
    And User clicks on the login button
    Then User should be taken to enter time track page.
    When User clicks on Task menu.
    Then Task list page should be displayed
    When User clicks on add new button
    Then User selects the option new customer
    When User enters customer name in the text box
    And User enters description in the description box
    And User clicks on the create button
    Then User validate customer is created
    Then User logs out of the application
