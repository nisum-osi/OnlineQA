Feature: Google Search

  @sanity
  Scenario: verify prequalify for unison
    Given I open a browser
    When I visit unison website
    And I click on Payoff debt
    And start the application with unison
    And select retire option
    And select valid address and prequalify the propery
    And submit the form
    Then should see the form successfully