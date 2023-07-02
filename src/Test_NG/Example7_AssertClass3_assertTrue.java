package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass3_assertTrue 
{
	@Test
	public void TC1()
	{
		boolean actuResult=true;
		Assert.assertTrue(actuResult); //if we want true result then we are using this method
		
	}
	@Test
	public void TC2()
	{
		boolean actuResult=false;
		Assert.assertTrue(actuResult,"Fail: condition is not matching"); //condition is not matching then TC get fail
		
	}

}
