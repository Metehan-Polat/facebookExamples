package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/facebookLogin.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class LoginFacebook extends AbstractTestNGCucumberTests {
}
