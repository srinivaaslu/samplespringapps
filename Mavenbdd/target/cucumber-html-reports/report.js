$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Example.feature");
formatter.feature({
  "id": "fizz-buzz-game",
  "description": "So that plays can be validated\r\nAs a fizzbuzz empire\r\nI want to enter a play and see the correct answer",
  "name": "Fizz Buzz Game",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "fizz-buzz-game;get-answers-based-on-the-played-number",
  "description": "",
  "name": "Get answers based on the played number",
  "keyword": "Scenario",
  "line": 5,
  "type": "scenario"
});
formatter.step({
  "name": "i am officiating a fizz buzz game",
  "keyword": "Given ",
  "line": 6
});
formatter.step({
  "name": "the number 1 is played",
  "keyword": "When ",
  "line": 7
});
formatter.step({
  "name": "i should be told the correct answer is \"1\".",
  "keyword": "Then ",
  "line": 8
});
formatter.match({
  "location": "BlankStepDefs.i_am_officiating_a_fizz_buzz_game()"
});
formatter.result({
  "duration": 155217318,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 11
    }
  ],
  "location": "BlankStepDefs.the_number_is_played(int)"
});
formatter.result({
  "duration": 3016220,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 40
    }
  ],
  "location": "BlankStepDefs.i_should_be_told_the_correct_answer_is_(String)"
});
formatter.result({
  "duration": 3363535,
  "status": "passed"
});
formatter.uri("FirstSeleniumWeb.feature");
formatter.feature({
  "id": "access-seleniumframework.com-website",
  "description": "Use selenium java with cucumber-jvm and navigate to website",
  "name": "access seleniumframework.com website",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "access-seleniumframework.com-website;print-title-,-url",
  "description": "",
  "name": "print title , url",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "i open seleniumframework website",
  "keyword": "When ",
  "line": 4
});
formatter.step({
  "name": "i validate title and url",
  "keyword": "Then ",
  "line": 5
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});