package testRunner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
			(
				features=".//Feature/1_QA-67.feature",
				glue="stepDefinitions",
				dryRun=false,
				monochrome=true,
				plugin= {"pretty","html:test-Output","json:target/cucumber-reports/Cucumber.json"}

			)
public class testRun1 {

}
