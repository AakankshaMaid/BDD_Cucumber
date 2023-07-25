package RunnerClasses;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
( 
		
	features = {"src\\test\\resources\\FeatureFile\\Orders.feature"},	
	glue = {"StepsDefination"},
	
	plugin = {"pretty"}
	
)



public class OrderRunnerClass extends AbstractTestNGCucumberTests
{

}
