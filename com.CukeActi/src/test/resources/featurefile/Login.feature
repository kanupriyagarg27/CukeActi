Feature: Login Feature
Scenario: User Logs in Scenario
    Given User navigates to Actitime page
    Then User validates the login page title
    When User enters username as "admin" and password as "manager"
    And User clicks on the login button