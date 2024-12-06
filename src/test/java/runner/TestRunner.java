package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/resources/",
        glue="StepDefinitions"
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
