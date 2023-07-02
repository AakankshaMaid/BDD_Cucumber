package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_groups1 
{
	@Test(groups="login")
	public void TC1()
	{
		Reporter.log("Running Tc1",true);
	}
	@Test(groups="login")
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	@Test(groups="setting")
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	@Test(groups="profile")
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}

}
