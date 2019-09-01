package runner;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features={"src//test//java//features"},
					glue={"stepdefinitions","utility"},
                    plugin = {"pretty","html:target/cucumber-reports"},
					tags ={"@sanity"},
					monochrome = true
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
