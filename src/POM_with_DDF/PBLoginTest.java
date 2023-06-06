package POM_with_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//excel sheet
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazaar&pb_campaign=Policy_Bazaar00Brand&gad=1&gclid=Cj0KCQjw7PCjBhDwARIsANo7Cgmbdj0UEW3WGw9QmNsfaVw1Nbq4hqDEZVV4kU4Kdua8cK0mv1ybVe0aAvNbEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLogInPage login=new PBLogInPage(driver);
		login.clickPBLogInPageSignIn();
		
		String mobnum=sh.getRow(0).getCell(0).getStringCellValue();
		PBMobNumPage mob=new PBMobNumPage(driver);
		mob.inputPBMobNumPageMobNum(mobnum);
		mob.clickPBMobNumPageSignInWithPwd();
		
		String pw=sh.getRow(0).getCell(1).getStringCellValue();
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.inputPBPwdPagePwd(pw);
		pwd.clickPBPwdPageSignIn();
	Thread.sleep(2000);	
		PBHomePage home=new PBHomePage(driver);
		home.openDDOptionPBHomePageMyAcc();
		
		PBMyAccPage myacc=new PBMyAccPage(driver);
		myacc.clickPBMyAccPageMyProfile();
		
		String name=sh.getRow(0).getCell(2).getStringCellValue();
		PBProfilePage profile=new PBProfilePage(driver);
		profile.switchToWindow();
		profile.verifyPBProfilePagefullName(name);
		
		driver.quit();
	}

}
