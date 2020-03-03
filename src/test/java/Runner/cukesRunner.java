package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={ "src/test/resources/com.cucumber.features/WebOrderLogin.feature"},
        glue="StepDefinition",
        dryRun=false,
        monochrome=true

)
public class cukesRunner {
}
