package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_groups2
{
	@Test(groups="setting")
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	@Test(groups="profile")
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}

	@Test(groups="profile")
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}

	@Test(groups="login")
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}


}
