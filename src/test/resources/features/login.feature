@wip
Feature: login functionality



  Scenario: manager login
    When Given user is on the login page
    When user logs in using "Lunch_InvoicingManager@info.com" and "LD686gfX22"
    Then message should be "Congratulations, your inbox is empty"
    When user goes to Lunch page
    Then user should be able to see the message "An error occurred"
    When user click on the button "Ok"
    Then the title should be "New Order - Odoo"

  Scenario: user login
    When Given user is on the login page
    When user logs in using "Lunch_Invoicing_User@info.com" and "LD686gfX26"
    Then message should be "Congratulations, your inbox is empty"
    When user goes to Lunch page
    Then user should be able to see the message "An error occurred"
    When user click on the button "Ok"
    Then the title should be "New Order - Odoo"