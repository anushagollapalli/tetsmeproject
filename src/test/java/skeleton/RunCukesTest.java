package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags= {"@smoke"},plugin = {"json:target/cucumber.json"})
public class RunCukesTest {
}
