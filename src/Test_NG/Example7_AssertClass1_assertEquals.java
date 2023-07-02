package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7_AssertClass1_assertEquals {
	@Test
	public void TC1()
	{
		String actu="Hii";
		String expt="Hii";
		//className.MethodName()
		Assert.assertEquals(actu, expt); //both actu and expt result same then TC get pass
	}
	@Test
	public void TC2()
	{
		String actu="Hii";
		String expt="Hello";
		//className.MethodName()        here we can provide failuar msg also
		Assert.assertEquals(actu, expt,"Fail:both result are not equal"); //both actu and expt result are not equal then TC get fail
	}
	

}
