package com.library.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/library/StepDefinitions",
        dryRun = true,
        tags = "@login",
        publish = true

)
public class CucumberRunner {
}

