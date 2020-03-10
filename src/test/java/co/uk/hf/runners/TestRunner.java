package co.uk.hf.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/co/uk/hf/features"},
        plugin = {"pretty", "json:target/report.json", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
        glue = {"co/uk/hf/hooks","co/uk/hf/stepDefinitions"}
)

public class TestRunner {
}
