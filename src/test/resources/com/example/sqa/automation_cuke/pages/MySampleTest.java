package com.example.sqa.automation_cuke.pages;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"}, glue = { "com.example.sqa.automation_cuke.pages" }, features = {
        "classpath:com/example/sqa/automation_cuke/pages/sample_test.feature" })
public class MySampleTest {

}
