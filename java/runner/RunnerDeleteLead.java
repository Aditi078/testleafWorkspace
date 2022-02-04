package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features = "src/test/java/features/DeleteLead.feature", glue = "steps", dryRun = false, snippets = SnippetType.CAMELCASE, monochrome = true, publish = true)
public class RunnerDeleteLead extends AbstractTestNGCucumberTests {

}
