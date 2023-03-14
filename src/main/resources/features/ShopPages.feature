Feature: Shopping
  Scenario: User buy black Heels
    Given User open Browser and Url
    When User go back to Orders
    And User brow product
    And User pick item
    And User choose variant
    Then User click button Add to Cart