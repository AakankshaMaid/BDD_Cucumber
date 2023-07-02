
package Test_NG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

    public class Example7_SoftAssertClass1 
    {
   //when we have to check multiple condition in one method without getting fail then we are using SoftAsset class
   //using HardAssert class when one condition get fail then other are not execute for overcome this we use soft class	
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert(); 
		
		String actu="hii";
		String expt="hii";
		soft.assertEquals(actu, expt);  //pass
		
		boolean actuResult1=false;
		soft.assertTrue(actuResult1,"Fail:condition is not fullfill");  //fail
		
		boolean actuResult2=true;
		soft.assertTrue(actuResult2);  //pass
		
		 soft.assertAll(); //this method is mandetory to execute all the conditions
	}

}
