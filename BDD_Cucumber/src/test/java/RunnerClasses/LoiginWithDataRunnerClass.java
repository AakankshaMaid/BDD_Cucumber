package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
  features = {"C:\\Users\\aakan\\OneDrive\\Desktop\\BDD_Cucumber\\src\\test\\resources\\FeatureFile\\loginWithData.feature"},
  
  glue =  {"StepsDefination"},
  
  publish=true


)
public class LoiginWithDataRunnerClass extends AbstractTestNGCucumberTests {

}
