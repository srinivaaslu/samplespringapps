package com.example;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by 205025 on 7/5/2016.
 */
public class BlankStepDefs {
    public WebDriver driver;
    private Example _target;
    private String _actualResult;

    @Given("^i am officiating a fizz buzz game$")
    public void i_am_officiating_a_fizz_buzz_game() throws Throwable {
        _target = new Example();
    }


    @When("^the number (\\d+) is played$")
    public void the_number_is_played(int arg1) throws Throwable {
        _actualResult = _target.checkPlay(arg1);
    }

    @Then("^i should be told the correct answer is \"([^\"]*)\".$")
    public void i_should_be_told_the_correct_answer_is_(String arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        Assert.assertEquals(arg1,_actualResult);
    }
//    public BlankStepDefs() {
//        driver = Hook.webDriver;
//    }

    @When("^I open seleniumframework website$")
    public void i_open_seleniumframework_website() throws Throwable { // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.get("http://www.seleniumframework.com");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.", driver.getTitle());
        assertEquals("http://www.seleniumframework.com/", driver.getCurrentUrl());
    }
}
