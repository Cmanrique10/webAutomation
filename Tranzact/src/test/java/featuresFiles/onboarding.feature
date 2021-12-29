Feature: As a User I want to create a new account into AutomationPractice Store

  Scenario: Create a new account AutomationPractice Store website using correct credentials
    Given The AutomationPractice Store home page is displayed
    And I click on Sign in button
    And I enter a valid email address account
    And I click on Create an account button
    And I enter information in the Personal Information section
    And I enter my Adress in the Adress section
    When I click on the Register button
    Then I should be presented AutomationPractice Store page with my logged in user.


