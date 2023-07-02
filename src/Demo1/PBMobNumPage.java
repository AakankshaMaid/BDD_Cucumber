package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v109.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {
	@FindBy(xpath="(//input[@id='central-login-module-sign-mobile'])[2]")private WebElement mobnum;
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signinwithpwd;
	
	public PBMobNumPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPBMobNumPagemobnum(String num)
	{
		mobnum.sendKeys(num);
	}
	public void clickPBMobNumPagesigninwithpwd()
	{
		signinwithpwd.click();
	}

	
	

}
