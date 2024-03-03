package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Featurres",
glue ="stepDefinitions", tags="@Sanity")
public class TestNGRunner extends AbstractTestNGCucumberTests{
}

