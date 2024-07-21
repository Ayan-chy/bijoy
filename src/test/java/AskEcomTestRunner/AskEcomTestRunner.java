package AskEcomTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import AskEcomUtility.AskEcomBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = {"src/test/resource/AskEcomAllFeatures"},
plugin = {"json:target/cucumber.json", "html:target/cucumber-reports", "pretty"},
glue = "AskEcomStepDefinition" 
//tags= "@smoke or @regression" 
)

public class AskEcomTestRunner extends AbstractTestNGCucumberTests {

	AskEcomBase bStart=new AskEcomBase();
	
	@BeforeTest
	public void browserLaunch () {
		AskEcomBase bStart=new AskEcomBase();
		bStart.BrowserSetup();
	}
	
	@AfterTest
	public void browserClose () {
		
		AskEcomBase bClose=new AskEcomBase();
		bClose.driver.quit();
		
	}
}
