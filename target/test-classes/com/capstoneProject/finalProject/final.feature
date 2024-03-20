Feature: Verify website functionality

  Scenario: Verify title of the home page
    Given User navigates to the website http://the-internet.herokuapp.com/
    Then The title of the page should be "The Internet"

  Scenario: Verify A/B Testing page
    Given User navigates to the website http://the-internet.herokuapp.com/
    When User clicks on the A/B Testing link
    Then The text on the page should be "A/B Test Variation 1"

  Scenario: Verify dropdown functionality
    Given User navigates to the website http://the-internet.herokuapp.com/
    And User clicks on the Dropdown link
    When User selects Option 1 from the dropdown
    Then Option 1 should be selected

  Scenario: Verify presence of hyperlinks on Frames page
    Given User navigates to the website http://the-internet.herokuapp.com/
    And User clicks on the Frames link
    Then Nested Frames link should be presented
    And iFrame link should be presented
