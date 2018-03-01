Feature: Bowling sample feature
  In order to experiment BDD on bowling kata
  As a team member
  I want to see an example of feature file

  Scenario: I never knock down pin
    Given a new bowling game
    When all of my balls are landing in the gutter
    Then my score should be 0