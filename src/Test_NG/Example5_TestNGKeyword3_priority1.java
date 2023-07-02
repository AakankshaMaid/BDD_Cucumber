package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_TestNGKeyword3_priority1 
{
	@Test(priority=1)   //priority keyword is use to deside the test case execution priority
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test(priority=3)
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test(priority=2)
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}

}
