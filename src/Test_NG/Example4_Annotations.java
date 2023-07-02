package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example4_Annotations {
	@BeforeClass   //this annotation execute 1st before the all test and method annotation
	public void openBrowser()
	{
		Reporter.log("open the browser",true);
	}
	
	@BeforeMethod      //this annotation use to execute the statement before the all test method
	public void logInToApp()
	{
		Reporter.log("--log In To App--",true);     //Execution steps:-->
		                                            //For TC=
	}                                               // step1: openBrowser
	                                                // step2: logInToApp
	@Test              //test method                // step3: TC1 execute
	public void TC1()                               // step4: logOutApp
	{                                               //  
		Reporter.log("running TC1",true);           // For TC2=
	}                                               //
	                                                // step7: logInToApp
	@Test              //test method                // step8: TC2 execute
	public void TC2()                               // step9: logOutApp
	{                                               // step10: closeBrowser
		Reporter.log("running TC2",true);
	}
	
	@AfterMethod      //this annotation use to execute the statement after all the test method
	public void logOutApp()
	{
		Reporter.log("--log Out App---",true);
	}
	
	@AfterClass
	public void closeBrowser()  //this annotation execute last after the all test and method annotation
	{
		Reporter.log("close the browser",true);
	}
	
	

}
