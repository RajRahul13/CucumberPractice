package stepdefinitions.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/rahul/eclipse-workspace/CucumberJava/Feature",glue= {"stepdefinitions.cucumber"},
monochrome = true,
plugin = {"pretty","junit:target/Reports/xmlReports","json:target/Reports/jsonReports","html:target/Reports/HtmlReports"},
tags = "@SmokeTest"
)

public class Runner {

}
