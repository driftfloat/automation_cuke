package com.example.sqa.automation_cuke.pages;

import org.junit.Assert;

import cucumber.api.java.en.Given;

public class SampleTestStepDefinition {

    @Given("^that I have my animals$")
    public void that_I_have_my_animals() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("MySampleTest.that_I_have_my_animals() ran!");   
        Assert.assertEquals(1, 1);
    }
}
