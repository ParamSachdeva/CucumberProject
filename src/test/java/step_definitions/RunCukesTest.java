package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(plugin = {		
		"junit:target/json/cucumber-results.xml",
		"json:target/json/cucumber.json",
		"html:target/cucumber-html-report"
},
features = { "classpath:features" },
/*
@CucumberOptions(
		features = "classpath:features",
		plugin = {
				"pretty", "html:target/cucumber-html-report",
				"json:target/cucumber.json", 
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json", 
				"junit:target/cucumber-results.xml",
				"pretty:target/cucumber-results.html"
		},*/
		tags = {}
		)
public class RunCukesTest{
	
}


/*package step_definitions;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = {}
		)
 

@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
retryCount = 3,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
//coverageReport = true,
jsonUsageReport = "target/cucumber-usage.json",
usageReport = true,
toPDF = true,
outputFolder = "target")


@CucumberOptions(plugin = {
		"html:target/cucumber-html-report",
		"json:target/cucumber.json", 
		"pretty:target/cucumber-pretty.txt",
		"usage:target/cucumber-usage.json", 
		"junit:target/cucumber-results.xml"
		},
tags = {"@Test"})
public class RunCukesTest{

}*/