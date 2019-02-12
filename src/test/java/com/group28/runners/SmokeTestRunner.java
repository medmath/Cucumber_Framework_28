package com.group28.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
             "html:target/default-cucumber-reports",
              "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/group28/step_definitions"
        , dryRun = false
        , tags = "@smoke"
)
public class SmokeTestRunner {
}