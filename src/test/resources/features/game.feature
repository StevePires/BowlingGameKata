Feature: Playing a bowling game
  Background: In order to experiment BDD on bowling kata
    As a team member
    I want to see an example of feature file

  Scenario: I never knock down pin
    Given a new bowling game
    When i roll the ball and hit 0 pins
    Then my score should be 0

    ## Nonsense, because we don't know what to score
    ## until second roll at least
#  Scenario: I knocked down 5 pin
#    Given a new bowling game
#    When i roll the ball and hit 5 pins
#    Then my score should be 5

  Scenario: I knocked first frame
    Given a new bowling game
    When i roll the ball and hit 5 pins
     And i roll the ball and hit 4 pins
    Then my score should be 9

  Scenario: I knocked first spare
    Given a new bowling game
    When i roll the ball and hit 3 pins
    And i roll the ball and hit 7 pins
    Then my score should be 0

  Scenario: I knocked first spare plus one roll (not X)
    Given a new bowling game
    When i roll the ball and hit 3 pins
    And i roll the ball and hit 7 pins
    And i roll the ball and hit 6 pins
    Then my score should be 16

  Scenario: I knocked second spare
    Given a new bowling game
    When i roll the ball and hit 3 pins
    And i roll the ball and hit 7 pins
    And i roll the ball and hit 4 pins
    And i roll the ball and hit 6 pins
    Then my score should be 14