Feature: Login Shop

  Scenario: User invalid login into shop demoqa
    Given User open browser and url
    When User go to My Account
    And User enter valid username
    And User enter invalid password
    And User click button login
    Then User get message ERROR

  Scenario: User successful login shop demoqa
    When User enter valid password
    And User click button login
    Then User go to page Dashboard