package Test_NG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_TestNGKeyword3_priority2 
{
   @Test   //if priority is not mention in that case priority should be by default 0 i.e priority=0 and execute with alphabetical order
   public void TC1()
   {
	   Reporter.log("running TC1",true);
   }
   
   @Test(priority=-2)  //negative priority also accepted
   public void TC2()
   {
	   Reporter.log("running TC2",true);
   }
   
   @Test(priority=3)  //in duplicate priority test class will execute according to alphabetical order
   public void TC3()
   {
	   Reporter.log("running TC3",true);
   }
   
   @Test(priority=3)
   public void TC4()
   {
	   Reporter.log("running TC4",true);
   }
}
