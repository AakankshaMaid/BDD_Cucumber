package Test_NG;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example3_EmailableReport {
	@Test
	public void TC1()   //test case or test method
	{
		//System.out.println("running TC1 test case");
		Reporter.log("running TC1 test case",true); //className.methodName("msg",true)
	}
	@Test
	public void TC2() //test case or test method
	{
		//System.out.println("running TC2 test case");
		Reporter.log("running TC2 test case",true);
	}
	
	@Test
	public void TC3()
	{
		//System.out.println("running TC3 test case");
		Reporter.log("running TC3 test case",true);
	}

}
