package SeleniumTests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/*@RunWith(Cucumber.class)*/
  @CucumberOptions(features =
  "C:\\Users\\z011615\\eclipse-workspace\\CucumberDemo\\Feature\\LogIn_Test.feature", 
  glue = {"C:\\Users\\z011615\\eclipse-workspace\\CucumberDemo\\src\\test\\java\\stepDefinition"
  })
 
public class TestRunner {

}
