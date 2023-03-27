import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = "pretty",
		monochrome = true,
		
		snippets = SnippetType.CAMELCASE,
		
		//valida se o mapeamento está correto (dryRun = true).

		dryRun = false, 
		strict = false
		)

public class Runner {

}
