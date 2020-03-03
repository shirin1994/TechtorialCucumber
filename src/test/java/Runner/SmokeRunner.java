package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue="StepDefinition",
        monochrome = true,
        dryRun = false,
        tags = "@smoke"
)

public class SmokeRunner {
}
