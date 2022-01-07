package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features" 
                 ,glue = "com/stepDef"
                 ,plugin = {"html:target/cucumber/CityBank-Report.html","json:target/cucumber/CityBank-Report.json"}
                 ,monochrome = true
                 ,dryRun = false)

public class ChaseRunner {

}
