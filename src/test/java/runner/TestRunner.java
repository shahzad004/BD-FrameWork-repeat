package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        features ="src/test/resources/features",
        glue = "stepdefinations",
        tags = "@SMOKE"

)

public class TestRunner extends AbstractTestNGCucumberTests {}