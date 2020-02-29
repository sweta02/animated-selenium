package com.salesforcelogin.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/features",
        dryRun = false,
        strict = false,
        plugin = {"json:target/cucumber.json"})

public class RunCukes {


}
