package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\utkar\\eclipse-workspace\\RLL\\src\\test\\java\\features\\eshop.feature",
glue = {"steps"},
dryRun = false,
plugin = {"html:target/Cucumberreport.html",
		 "pretty",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "timeline:test-output-thread/"
		 }
)

public class Cucumberrunner {
	
	

}
