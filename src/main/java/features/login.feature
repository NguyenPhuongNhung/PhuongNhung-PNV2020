Feature: Login

  Scenario Outline: Login successfully
    Given I open the <website>
    Then I verify that I already in login page
    When I click on select option
    When I choose username as <value>
#    When I click on login button
#    Then I verify login successfully

    Examples:
      | website                                                               | value        |
      | http://www.way2automation.com/angularjs-protractor/banking/#/customer | Harry Potter |
