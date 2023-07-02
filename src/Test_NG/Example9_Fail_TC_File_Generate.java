package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example9_Fail_TC_File_Generate 
{
	public class Example8_DisableTCExecutionFromTestSuite
	{
		@Test
	    public void TC1()
	    {
			Reporter.log("running TC1",true);
	    }
		//when TC get fail then failed.xml file generated in testNg.output folder in that all fail TC are present
//		@Test
//	    public void TC()
//	    {
//			Reporter.log("running TC1",true)
//	    }
		@Test
	    public void TC2()
	    {
			Reporter.log("running TC2",true);
	    }
		@Test
	    public void TC3()
	    {
			Reporter.log("running TC3",true);
	    }
		@Test
	    public void TC4()
	    {
			Reporter.log("running TC4",true);
	    }
	}

}
