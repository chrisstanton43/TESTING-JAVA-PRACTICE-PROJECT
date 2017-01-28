
Feature: Customer Registration to mandmdriect
  As a rupali customer i want to login
  So that i can access my account

  Scenario: Registration
    Given I enter the url as mandmdirect
    When I click on Myaccount link
    Then I should be on "Sign In" page
    When I enter my email address
    And I Continued As guest
    And I click on "Continue" button
    Then I am on "Simplify your Shopping with an MandM Direct Account"page
    When I select title as "Mr"
    And I enter firstName as "Srao"
    And I entet secondName as "Chavala"
    And I enter mobileNumber as "7710138715"
    And I enter ConfirmEmailAddress as "mail2chavala@gmail.com"
    And I enter the Password as "as543539"
    And I enter the Confirmation password as "as543539"
    And I entet Country as "United Kingdom"
    And I enter HouseNumber/Name as "124"
    And I enter Postcode as "NE4 5AB"
    Then I click on "Find my address" link
    When I click on "Sign up"button

@wip
  Scenario: Registered Customer login
    Given I enter the url as mandmdirect
    When I click on Myaccount link
    Then I should be on "Sign In" page
    When I enter my email address
#    And I Continued As existing customer
    And I enter the Password "as543539"
    And I click on "Continue" button
    Then I should see "Welcome to My MandM" page
    When I click on "Continue Shopping"
    Then I should be on "Panel Navigation"
