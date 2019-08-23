Feature: CaseStudy
@smokee
  Scenario Outline: Registration
    Given TestMe App is launched
    Then click on SignUp link
    Then fill username "<username>"
    Then fill firstname "<firstname>"
    Then fill lastname "<lastname>"
    Then fill password "<password>"
    Then confirm password "<confirmpassword>"
    Then fill gender
    Then fill email "<email>"
    Then fill mobilenumber "<mobile number>"
    Then fill DOB "<DOB>"
    Then fill address "<Address>"
    Then fill sec question
    Then fill answer "<answer>"
    Then click on registration button
    And verify the registration login

    Examples: 
      | username | firstname | lastname  | password   | confirmpassword | email            | mobile number | DOB        | Address   | answer     |
      | lalitha  | anusha    | gollaplli | passwors13 | passwors13      | anu@gmail.com    |    9999999991 | 02/02/1998 | hyderabad | warangal   |
      
@smoke
  Scenario Outline: Login with different usernames
    Given enter valid credentials in user name "<username>"
    And enter valid credentials in password "<password>"
    And click on login page
    Then verify Login Process

    Examples: 
      | username | password    |
      | lalitha  | password123 |
      
      
      
@smoke
  Scenario: add to cart
    Given search for product
    Then click on find details
    Then click on add to cart
    Then proceed with payment
    And continue payment process
@smoke
  Scenario: without proper order
    Given search the headphone
    Then it is not added to cart
    Then try to proceed payment without adding
    And testme app doesnt proceed
