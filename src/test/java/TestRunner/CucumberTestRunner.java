package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",features={"src/test/java/Features"},
glue = {"StepDefination"},
plugin = {"pretty","html:target/CucumberReport.html"})

public class CucumberTestRunner {

}
