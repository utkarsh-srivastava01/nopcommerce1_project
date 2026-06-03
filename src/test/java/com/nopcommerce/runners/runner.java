package com.nopcommerce.runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/resources/Features",
	    glue = "com.nopcommerce.stepdefinition",
	    plugin = {
	        "pretty",
	        "html:src/test/resources/Reports/cucumber-reports.html"
//	        "json:src/test/resources/Reports/cucumber.json"
	    }
//	    monochrome = true
	)
	public class runner extends AbstractTestNGCucumberTests {
	}



