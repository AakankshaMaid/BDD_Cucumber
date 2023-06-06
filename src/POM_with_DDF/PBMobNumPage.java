package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement SignInwithPw;
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPBMobNumPageMobNum(String mobnum)
	{
		mobNum.sendKeys(mobnum);
	}
	public void clickPBMobNumPageSignInWithPwd()
	{
		SignInwithPw.click();
	}

}
