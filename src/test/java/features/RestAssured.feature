Feature: Validate rest assured

  Scenario : Verify the api request and response

    Given I set rest api server
    When I execute check registration api request
    Then I should see the response accordingly