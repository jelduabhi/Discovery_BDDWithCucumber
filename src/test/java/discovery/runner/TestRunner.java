package discovery.runner;

	import org.apache.log4j.xml.DOMConfigurator;
	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.runner.RunWith;

	import com.cucumber.listener.Reporter;

	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "Features Files", 
			glue = {"discovery.stepdefinition"},
			plugin = { "pretty","html:target/Reports"},
			//tags = {"@sample"},
			monochrome = true
	)
	public class TestRunner {
		
		
		@BeforeClass
		public static void  beforesetup() {
			DOMConfigurator.configure("log4j.xml");
		}
		
		@AfterClass
		public static void setup() {
	       Reporter.setTestRunnerOutput("Sample test runner output message");
		}

	}
