package Demo1;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest extends PBBaseClass
{
	PBLogInPage login;PBMobNumPage mob;PBPwdPage pwd;PBHomePage home;PBMyAccPage myacc;PBProfilePage profile; PBUtilityClass utility;
	@BeforeClass
	public void PBopenBrowser()
	{
		opneBrowser();
		utility=new PBUtilityClass();
		login=new PBLogInPage(driver);
		mob=new PBMobNumPage(driver);
		pwd=new PBPwdPage(driver);
		home=new PBHomePage(driver);
		myacc=new PBMyAccPage(driver);
		profile=new PBProfilePage(driver);
			
	}
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.clickPBLogInPagesignin();
		Thread.sleep(2000);
		mob.inputPBMobNumPagemobnum(utility.Excel(0, 0));
		Thread.sleep(2000);
		mob.clickPBMobNumPagesigninwithpwd();
		Thread.sleep(2000);
		pwd.inputPBPwdPagepwd(utility.Excel(0, 1));
		Thread.sleep(2000);
		pwd.clickPBPwdPagesigin();
	}
	@Test
	public void verify() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(2000);
		home.openDDListPBHomePagemyacc();
		Thread.sleep(2000);
		myacc.clickPBMyAccPageprofile();
		Thread.sleep(2000);
		profile.switchToWindow();
		Thread.sleep(2000);
		String actualresult=profile.verifyPBProfilePagefullname();
		Assert.assertEquals(actualresult, utility.Excel(0,2));
		Reporter.log("Verify by Aakanksha",true);

	}
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();

	}
	@AfterClass
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();

	}
	
}
