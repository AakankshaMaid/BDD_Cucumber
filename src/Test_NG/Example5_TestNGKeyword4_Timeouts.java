package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_TestNGKeyword4_Timeouts {
	@Test(timeOut=5000)  //this method set time for execution test
	public void TC1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("tc1 running",true);
	}
	

}
