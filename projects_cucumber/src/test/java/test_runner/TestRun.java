package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(features = {".//features"},glue="stepDefinitions") //.feature means it will execute all the files which are inside the folder
@CucumberOptions(features = { ".\\features\\Login.feature" }, glue = "com.Orangehrm.stepDefinitions", // package file
		dryRun = true, 
		monochrome = true, // to avoid junk characters in output
		publish = true) // to publish report in cucumber server
public class TestRun {

}
