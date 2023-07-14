package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/main/java/features/login.feature"},
		dryRun = !true,
		snippets=SnippetType.CAMELCASE,
		monochrome= true,
		glue= "steps"// steps indicate the package name
		
		)
public class Runner extends AbstractTestNGCucumberTests{

}
