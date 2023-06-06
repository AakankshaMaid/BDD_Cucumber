package Demo2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPagesignin();
		
		PBMobNumPage mob=new PBMobNumPage(driver);
		mob.inputPBMobNumPagemobnum();
		mob.clickPBMobNumPagesigninwithpwd();
		
		PBPwdPage pwd=new PBPwdPage(driver);
		pwd.inputPBPwdPagepwd();
		pwd.clickPBPwdPagesignin();
		
		Thread.sleep(2000);
		PBHomePage home=new PBHomePage(driver);
		home.openDDListPBHomePagemyacc();
		
		PBMyAccPage myacc=new PBMyAccPage(driver);
		myacc.clickPBProfilePageprofile();
		Thread.sleep(2000);

		PBProfilePage profile=new PBProfilePage(driver);
		profile.switchtowindow();
		profile.verifyPBProfilePagefullname();
		driver.quit();
				
	}

}
