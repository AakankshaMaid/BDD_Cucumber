package Demo3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PBTestClass {
      @Test
      public void m1() throws EncryptedDocumentException, IOException, InterruptedException 
      {
    	  FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
    	  Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
    	  
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		PB_LogIn_Page login=new PB_LogIn_Page(driver);
		login.clickPBLogInPageSignIn();
		
		String s1=sh.getRow(0).getCell(0).getStringCellValue();
		PBMobNumPage mob=new PBMobNumPage(driver);
		mob.inputPBMobNumPageMobNum(s1);
		mob.clickPBMobNumPageSignInWithPwd();
		
		String s2=sh.getRow(0).getCell(1).getStringCellValue();
        Thread.sleep(2000);
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.inputPBPwdPagePwd(s2);
		pwd.clickPBPwdPageSignIn();
		Thread.sleep(2000);
		PBHomePage home=new PBHomePage(driver);
		home.openDDListBoxPBHomePageMyAcc();
		Thread.sleep(2000);
		PBMyAccPage acc=new PBMyAccPage(driver);
		acc.clickPBMyAccPageMyProfile();
		Thread.sleep(2000);
		String s3=sh.getRow(0).getCell(2).getStringCellValue();

		PBMyProfilePage prof=new PBMyProfilePage(driver);
		prof.SwitchToPage();
		prof.VerifyPBMyProfilePageFullname(s3);
		Thread.sleep(2000);
		driver.quit();
		
      }
	

}
