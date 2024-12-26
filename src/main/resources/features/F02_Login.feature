@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Background: the browser ist opened and URL is navigated
  #Valid Login --> Kindly register by using the given Mail and Pass to run the 1st Scenario.

  Scenario:  user could login with valid email and password

    And  user login with valid "standard_user" and "secret_sauce"
    And user press on login button
    Then user login to the system successfully
#Negative

  Scenario Outline: User could not login with invalid email and password

    And user logs in with invalid "<email>" and "<password>"
    And user press on login button
    Then user could not login to the system

    Examples:
      | email              | password      |
      | standard_user      | P@ssw0rd1     |
      | invalid@domain.com | secret_sauce  |
      | user@test.com      | 123456        |


