Feature: Fizz Buzz Game
  So that plays can be validated
  As a fizzbuzz empire
  I want to enter a play and see the correct answer
  Scenario: Get answers based on the played number
    Given i am officiating a fizz buzz game
    When the number 1 is played
    Then i should be told the correct answer is "1".

