
@test2
Feature: Manage User Profile

  Background:
    Given The user navigates to the home page


  Scenario: Verify that the user able to enter the Manage User Profile
    Given User clicks on the Login button on the home page navigation menu
    And User clicks email field and send emailAddress
    Then  User clicks password field and send password
    And User clicks on login button


  Scenario Outline: Verify that the user enter the Manage User Profile and edit User Account
    Given User clicks on the Login button on the home page navigation menu
    And User clicks email field and send emailAddress
    Then  User clicks password field and send password
    And User clicks on login button
    Then User clicks on userEdit button
    And User clicks Name field and enters a "<Name>"
    Given User clicks Position field and enters a "<Position>"
    Then User clicks Department field and enters a "<Department>"
    And User clicks Phone field and enters a "<Phone>"
    Then User clicks Mobile field and enters a "<Mobile>"
    And User clicks Fax field and enters a "<Fax>"
    Then User clicks save button and checks if the save is successfully


    Examples:
      | Name   | Position      | Department | Phone                          | Mobile                         | Fax                            |
      | Halil  | Manager       | Management | %%%%%%%%%%%%%%%%%%%%%%%%%%%%%% | %%%%%%%%%%%%%%%%%%%%%%%%%%%%%% | %%%%%%%%%%%%%%%%%%%%%%%%%%%%%% |
      |        | IT Specialist | IT         | aaaaaaaaaaaa                   | bbbbbbbbbbbbbbbb               | cccccccccccccccc               |
      |        | IT Specialist | IT         | aaaaaaaaaaaa                   | bbbbbbbbbbbbbbbb               | cccccccccccccccc               |
      | Markus |               |            | aaaaaaaaaaaa                   | bbbbbbbbbbbbbbbb               | cccccccccccccccc               |


  Scenario: Verify that the user can change
    Given User clicks on the Login button on the home page navigation menu
    And User clicks email field and send emailAddress
    Then  User clicks password field and send password
    And User clicks on login button
    Then User clicks on userEdit button
    And User clicks changeEmail button
    Then User clicks NewEmail Address and enters a new mail
    And User verifies if new mail request succesfully send
    Then User clicks cancel button on Change Mail page
    And User clicks changeEmail button

