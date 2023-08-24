import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = true,
        monochrome = true,
        features = {"src/test/resources/features"},
        glue = {"src/test/java/stepDefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@runThisScenario"
)
public class TestRunner {



}
