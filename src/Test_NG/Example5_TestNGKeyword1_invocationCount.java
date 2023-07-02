package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_TestNGKeyword1_invocationCount 
{
	@Test(invocationCount = 5)   //invocation keyword use for repeating the test case
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}

}
