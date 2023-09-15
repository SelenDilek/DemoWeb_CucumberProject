package Runner;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = "src/test/java/feature.feature" ,
        glue = {"StepDefinitions"},
        dryRun = false
)

public class Run extends AbstractTestNGCucumberTests {
}
