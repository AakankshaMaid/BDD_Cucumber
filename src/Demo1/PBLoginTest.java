package Demo1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PBLoginTest {
	@Test
	public void m() throws InterruptedException
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazaar&pb_campaign=Policy_Bazaar00Brand&gad=1&gclid=Cj0KCQjw7PCjBhDwARIsANo7Cgmbdj0UEW3WGw9QmNsfaVw1Nbq4hqDEZVV4kU4Kdua8cK0mv1ybVe0aAvNbEALw_wcB");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	PBLogInPage login=new PBLogInPage(driver);
	login.clickPBLogInPagesignin();
	
	PBMobNumPage mob=new PBMobNumPage(driver);
	mob.inputPBMobNumPagemobnum();
	mob.clickPBMobNumPagesigninwithpwd();
	
	PBPwdPage pwd=new PBPwdPage(driver);
	pwd.inputPBPwdPagepwd();
	pwd.clickPBPwdPagesignin();
	Thread.sleep(2000);
	PBHomePage home=new PBHomePage(driver);
	home.openDDlistPBHomePagemyacc();
	
	Thread.sleep(2000);
	PBMyAccPage myacc=new PBMyAccPage(driver);
	myacc.clickPBMyAccPagemyprofile();
	
	PBProfilePage profile=new PBProfilePage(driver);
	profile.switchtowindow();
	profile.verifyPBProfilePagefullname();
	driver.quit();
	}
}
