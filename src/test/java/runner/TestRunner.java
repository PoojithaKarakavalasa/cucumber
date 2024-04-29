package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features//Tags.feature",
				glue="stepDefinition",
				plugin={"pretty","html:target/cucumber-reports"},
				tags="@Smoke",
				dryRun=false,
				monochrome=true
				)
public class TestRunner 
{

}
