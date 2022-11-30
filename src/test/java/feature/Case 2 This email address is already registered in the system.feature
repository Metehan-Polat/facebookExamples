Feature: Register CoralTravel


  Scenario Outline: Test case 1:Register User
    Given Navigate to "<Browser>"
    When Navigate to Url
    Then Verify Coraltravel is visible
    And Click to become a member
    And Fill details: Name "<name>", Surname "<surname>", Email"<email>", Password"<password>", New Password Again"<newpasswordagain>", Mobile Number"<mobileNumber>",Mobile Numbersecond"<mobileNumbersecond>"
    And Select checkbox I have read the Clarification Text regarding the processing of my personal data by Coral.
    And Select checkbox I declare that I have read this Explicit Consent Text and accordingly, I have given my consent for Coral and its service providers to send me electronic messages for advertising, marketing, promotion and information purposes via SMS, e-mail and telephone.
    When Click the Subscribe button
    Then Alert This email address is already registered in the system.
    And Close

    Examples:
      | Browser | name | surname | email | password | newpasswordagain | mobileNumber | mobileNumbersecond |
      | Chrome | Ahmet | Kilic | ahmetkilic43123@gmail.com | ahmetkilic123. | ahmetkilic123. | 538 | 3979652 |
