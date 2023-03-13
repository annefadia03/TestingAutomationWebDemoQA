package com.juaracoding.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(
//        features = "src/main/resources/features/login.feature",
//        glue = {"com.juaracoding.cucumber"}
//)

//@CucumberOptions(
//        features = "src/main/resources/features/Recruitment.feature",
//        glue = {"com.juaracoding.cucumber"}
//)
@CucumberOptions(
        features = "src/main/resources/features/LoginShop.feature",
        glue = {"com.juaracoding.cucumber"},
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"}
)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
