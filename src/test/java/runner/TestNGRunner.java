package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\utkar\\eclipse-workspace\\RLL\\src\\test\\java\\features\\eshop.feature",
					glue = {"steps"},
					dryRun = false,
					plugin = {"html:target/Cucumberreport.html",
							 "pretty",
							 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
							 "timeline:test-output-thread/"
							 }
					)


public class TestNGRunner extends AbstractTestNGCucumberTests{

}
