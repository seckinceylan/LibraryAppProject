@login
Feature: As user I want to be able to login under different roles
#Background - test pre-condition
#  will be executed before every scenario in the particular feature file
  Background: common steps
    Given user is on the login page

  Scenario: Login as a "librarian"
    When user logs in as a "librarian"
    Then user should see dashboard page

  Scenario: Login as a "student59"
    When user logs in as a "student59"
    Then user should see dashboard page

  Scenario: Login as a "student60"
    When user logs in as a "student60"
    Then user should see dashboard page

  @negative_login1
  Scenario: Invalid password
    When user logs in with "librarian57@library" username and "wrong" password
    Then user verifies that "Sorry, Wrong Email or Password" message is displayed

  @negative_login2
  Scenario: Invalid username
    When user logs in with "wrong" username and "wrong" password
    Then user verifies that "Please enter a valid email address." message is displayed