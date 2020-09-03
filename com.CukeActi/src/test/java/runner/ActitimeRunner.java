package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/resources/featurefile/CreateCustomer.feature",
                       glue="steps", dryRun=false,
                       plugin= {"pretty","html:target/reports"},
                       monochrome=true)
public class ActitimeRunner extends AbstractTestNGCucumberTests {


}
