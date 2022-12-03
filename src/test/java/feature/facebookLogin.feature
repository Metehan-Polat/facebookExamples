Feature: Register CoralTravel

  Background:
    Scenario Outline:
    Given Navigate to "<Browser>"
    Given Navigate to Website

      Examples:
        | Browser |
        | Chrome |


  Scenario: Space Email and Space Password
    When Click the sign in button
    Then Verify Invalid username or password

  Scenario: Space email and Password
    And  enter password
    When Click the sign in button
    Then Verify Invalid username or password

  Scenario: Email and Space Password
    And enter email address
    When Click the sign in button
    Then Verify Invalid username or password

  Scenario: Wrong email and Password
    And enter wrong email address
    And  enter password
    When Click the sign in button
    Then Verify Is this your account?
    And press the turn off (X) button

  Scenario: Email and Wrong Password
    And enter email address
    And  enter wrong password
    When Click the sign in button
    Then Verify Is this your account?
    And press the turn off (X) button


  Scenario Outline: Email and Password
    And enter email address "<email>"
    And  enter password "<password>"
    When Click the sign in button
    Then See username in profile
    And Click on user account
    And Click the sign out button
    Examples:
      | email | password |
      | veli95830@gmail.com | veli123... |

