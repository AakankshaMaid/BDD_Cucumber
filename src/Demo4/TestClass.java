package Demo4;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	PBLogInPage login;PBMobNumPage mob;PBPwdPage pwd;PBHomePage home;PBMyAccPage myacc;PBProfilePage profile;
	int TCID;
	@BeforeClass
	public void openbrowser() throws IOException
	{
		initializeBrowser();
		login=new PBLogInPage(driver);
		mob=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
		home=new PBHomePage(driver);
		myacc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
		
	}
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		login.clickPBLogInPagesigin();
		Thread.sleep(2000);
		mob.inputPBMobNumPagemobnum(UtilityClass.getPFdata("MobNum"));
		Thread.sleep(2000);
		mob.clickPBMobNumPagesigninwithpwd();
		Thread.sleep(2000);
		pwd.inputPBPwdPagepwd(UtilityClass.getPFdata("Pwd"));
		Thread.sleep(2000);
		pwd.clickPBPwdPagesiginin();
		Thread.sleep(2000);
	}
	@Test
	public void verify() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=101;
		home.openDDListPBHomePagemyacc();
		Thread.sleep(2000);
		myacc.clickPBMyAccPageprofile();
		Thread.sleep(2000);
		profile.switchtowindow();
		String actualresult=profile.verifyPBProfilePagefullname();
		Thread.sleep(2000);
		Assert.assertEquals(actualresult,UtilityClass.Excel(0, 2) );
	}
	@AfterMethod
	public void logout(ITestResult s1) throws IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.captureSS(driver, TCID);
		}
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
	}

}
