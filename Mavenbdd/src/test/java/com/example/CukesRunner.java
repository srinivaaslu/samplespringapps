package com.example;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by 205025 on 7/4/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources",glue = "com.example",plugin={"pretty",
        "html:target/cucumber-html-reports","json:results/cucumber.json"}
)
public class CukesRunner {
}
