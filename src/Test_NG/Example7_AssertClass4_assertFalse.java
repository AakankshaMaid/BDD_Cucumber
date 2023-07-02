package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass4_assertFalse 
{
	@Test
	public void TC1()
	{
		boolean actuResult=false;
		
		Assert.assertFalse(actuResult); //when we want false result then this method shows TC pass
	}
	@Test
	public void TC2()
	{
		boolean actuResult=true;
		
		Assert.assertFalse(actuResult,"Fail: result mismatch"); //condition is not matching result is TC fail
	}

}
