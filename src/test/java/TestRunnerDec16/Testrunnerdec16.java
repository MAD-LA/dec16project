package TestRunnerDec16;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Base_parent;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/FeatureFiles"},
plugin = {"json:target/cucumber.json"},
glue = "StepDefinition", tags = {"@Cart"})

public class Testrunnerdec16 extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void metasetup() {
		Base_parent test = new Base_parent();
		test.metaBrowserinit();
		
		
		
	}
	
	@AfterTest
	public void metaCloseURL() {
		Base_parent test = new Base_parent();
		test.driver.quit();
		
		
		
		
		
	}
	
	
	
}
