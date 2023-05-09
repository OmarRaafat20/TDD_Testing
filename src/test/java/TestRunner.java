package test.java;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        publish = true,
        monochrome = true,
        features = "src/Features",
        glue = {"org/example/StepDefinitions"},
        plugin = {"pretty", "junit:target/JUnitReports/report.xml"})
public class TestRunner {

}



