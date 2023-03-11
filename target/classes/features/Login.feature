Feature: Login User HRM
  Scenario: User succesful Login into web HRM
    Given User open browser and url
    When User enter valid username
    And User enter valid password
    And User click button login
    Then User go to page Dashboard


  Scenario: User invalid Login into web HRM
    When User click button logout
    And User enter invalid username
    And User enter invalid password
    And User click button login
    Then User get message invalid credential
#
#  Scenario: User invalid Login into web HRM
#    And User enter invalid username
#    And User enter valid password
#    And User click button login
#    Then User get message invalid credential

#  Scenario: User invalid Login into web HRM
#    And User enter invalid username
#    And User enter invalid password
#    And User click button login
#    Then User get message invalid credential
