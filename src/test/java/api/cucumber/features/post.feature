Feature: Post feature of facebook
  This will test the post functionality at the user wall

  Scenario: Post the message on user wall
    Given User should be logged in and present on his wall
    When I type the message in the text box
    And click on post button
    Then the message should get posted

