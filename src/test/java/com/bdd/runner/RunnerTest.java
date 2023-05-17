package com.bdd.runner;

import io.cucumber.junit.CucumberOptions;
import io.restassured.response.Response;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"json:target/build/cucumber.json"},
        features = {"src/test/resources/features"},
        stepNotifications = true,
        glue = {"com.bdd.stepdefinition"},
        tags = "@APIToken"
)
public class RunnerTest {

    @BeforeClass
    public static void beforeExecution() {
    }

    @AfterClass
    public static void afterExecution() {

    }

}

