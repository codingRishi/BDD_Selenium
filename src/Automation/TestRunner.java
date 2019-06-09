package Automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Scenarios.feature",
                  plugin={"pretty","html:G:\\Selenium\\CR"}
                 )
public class TestRunner {

}
