Feature:AuthenticationFeature
  This is the description of the authentication feature

  Scenario: HappyPathLogin
    Given I have opened the application
    When I put in valid credentials
    And click Login
    Then I should see my personalize home page
    And I should see my account number
    