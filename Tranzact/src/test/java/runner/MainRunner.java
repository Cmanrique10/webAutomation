package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/featuresFiles/onboarding.feature"},
        glue = {"stepDefinition"}
     //   monochrome = true
       // tags = {},
       // plugin = {"pretty","html:target/cucumber","json:target/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
)

public class MainRunner extends AbstractTestNGCucumberTests {

}