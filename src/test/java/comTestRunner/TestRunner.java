package comTestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/ApiFeature/customer.feature",
		glue="StepDefination",
		dryRun=true
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	
}
