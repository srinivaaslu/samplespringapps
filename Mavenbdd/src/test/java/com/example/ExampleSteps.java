//package com.example;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import static org.junit.Assert.assertEquals;
//
///**
// * Created by 205025 on 7/5/2016.
// */
//public class ExampleSteps {
//    private Example _target;
//    private String _actualResult;
//
//    @Given("^i am officiating a fizz buzz game$")
//    public void i_am_officiating_a_fizz_buzz_game() throws Throwable {
//        _target = new Example();
//    }
//
//
//    @When("^the number (\\d+) is played$")
//    public void the_number_is_played(int arg1) throws Throwable {
//        _actualResult = _target.checkPlay(arg1);
//    }
//
//    @Then("^i should be told the correct answer is \"([^\"]*)\".$")
//    public void i_should_be_told_the_correct_answer_is_(String arg1) throws Throwable {
//        // Express the Regexp above with the code you wish you had
//        assertEquals(arg1,_actualResult);
//    }
//
//}
