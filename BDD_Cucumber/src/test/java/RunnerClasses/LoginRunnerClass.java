package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\FeatureFile\\loginFeature.feature"},
		
		glue = {"StepsDefination"},  // {" StepDefination pakage name you have to write"}
		
		publish=true  //this provide link in console which shows report
		  
		  )





public class LoginRunnerClass extends AbstractTestNGCucumberTests
{
  
 
}
