package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass2_assertNotEquals
{
	@Test
	public void TC1()
	{
		String actu="Hii";
		String expt="Hello";
		Assert.assertNotEquals(actu, expt); //actu and expet result is not matching then TC get pass
	}
	@Test
	public void TC2()
	{
		String actu="Hii";
		String expt="Hii";
		Assert.assertNotEquals(actu, expt,"Fail:both result matching"); //actu and expet result is  matching then TC get fail
	}

}
