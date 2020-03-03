package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={ "src/test/resources/com.cucumber.features/Etsy/Etsy.feature"},
        glue="StepDefinition/EtsyStepDefs",
        dryRun=false,
        monochrome=true
)
public class EtsyRunner {
}
