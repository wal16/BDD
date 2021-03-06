
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/result.json",
                "junit:target/result.xml"
        }
)
public class FeatureRunner
{
}