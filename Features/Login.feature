Feature: Login with Valid Credentials

@only
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "Admin" and Password as "admin123"
    And Click on Login button
    Then User navigates to MyAccount Page
