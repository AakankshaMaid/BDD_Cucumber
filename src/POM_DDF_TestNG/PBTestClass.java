package POM_DDF_TestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBTestClass extends PBBaseClass
{
	PBLoginPage login; PBMobNumPage mob; PBPwdPage Pwd;PBHomePage home;PBMyAccPage myacc;PBProfilePage profile;
   int TCID; 	
	@BeforeClass
	public void OpenBrowserForTest() throws IOException
	{
		OpenBrowser();
		login=new PBLoginPage(driver);
		mob=new PBMobNumPage(driver);
		Pwd=new PBPwdPage(driver);
		home=new PBHomePage(driver);
		myacc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
		
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.clickPBLoginPagesigin();
		Thread.sleep(2000);
		mob.inputPBMobNumPageMobNum(PBUtilityClass.getPFdata("MobNum"));
		Thread.sleep(2000);
		mob.clickPBMobNumPageSignInWithPwd();
		Thread.sleep(2000);
		Pwd.inputPBPwdPagePwd(PBUtilityClass.getPFdata("Pwd"));
		Thread.sleep(2000);
		Pwd.clickPBPwdPageSignIn();
		
	}
	@Test
	public void verify() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=101;
		Thread.sleep(2000);
		home.OpneDDListPBHomePageMyAcc();
		Thread.sleep(2000);
		myacc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		profile.switchToWindow();
		Thread.sleep(2000);
		String actualresult=profile.verifyPBProfilePagefullname();
		Assert.assertEquals(actualresult, PBUtilityClass.Excel(0, 2));
		Reporter.log("Test case verify by Aakanksha",true);
	
	}
	@AfterMethod
	public void logout(ITestResult s1) throws IOException 
	{
	  if(s1.getStatus()==ITestResult.FAILURE)
	  {
		  PBUtilityClass.captureSS(driver,TCID);
	  }
		
	}
	@AfterClass
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
