package runnerTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\u93234\\eclipse-workspace\\MMTest\\src\\test\\java\\features\\featureMMTest.feature"
		,glue={"C:\\Users\\u93234\\eclipse-workspace\\MMTest\\src\\main\\java\\stepDefinitions"}
		)

public class TestRunner {

}
