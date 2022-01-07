Feature: Test Smoke scenarios of Chase

  #  Scenario: Test chase account with invalid cridentials
  #    Given open chrome and start application
  #    When user provided invalid "username" and "password"
  #    Then user shouldn not able to login
  Scenario Outline: Test chase account with invalid cridentials
    Given open chrome and start application
    When user provided invalid <username> and <password>
    Then user shouldn not able to login

    Examples: 
      | username | password |
      | 'john'   | 'pass1'  |
