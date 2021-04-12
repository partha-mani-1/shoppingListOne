package stepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        plugin = {"pretty", "json:target/cucumber.json", "html:target/cucumber-report.html"},
        glue = {"stepDefinition"})
public class RunCucumberTest {

}
