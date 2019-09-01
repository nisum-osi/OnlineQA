Feature: Google Search

  @sanity
  Scenario: Validate google search text field
    Given I open a browser
    When I navigate to google page
    Then I validate the search text field
    When I enter "selenium automation" in text field
    And click on search button
    Then Selenium webdriver search results page should display
    And close the browserscenario with different controls

#  Scenario: Verify
#    Given I open a browser
#    When I navigate to gmail page
#    When I enter emailid & password in text field
#    And click on sign in button
#    Then it should land on home page of gmail
#    And close the browser


    Given I open a browser  Scenario: Verify all types of controls
    When I navigate to amazon page
    And get all links in homepage
    And close the browserscenario with different controls

  Scenario: Verify sample for javascript controls
    Given I open a browser
    When I navigate to guru99 page
    Then verify the script

  Scenario: Verify sample for ajax controls
    Given I open a browser
    When I navigate to guru99 ajax page
    Then verify the script

    Scenario: Get all links in unison home page
      Given I open a browser
      When I visit unison website
      And get all links in unison homepage
      And click on random link
      Then should reach correponding page