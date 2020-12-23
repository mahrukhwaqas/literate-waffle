

Feature: Test login functionality
  I want to make sure login functionality is working

  
  Scenario: verify login functionality using valid credentials 
  
    Given I am on the login page .
    
    And I enter valid user name 
    
    And and password
    
    When I click the login button
   
    Then I should see the dashboard