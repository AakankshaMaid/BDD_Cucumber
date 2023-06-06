package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage {
	@FindBy(xpath="//input[@type='password']")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signIn;
	
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inputPBPwdPagePwd(String pw)
	{
		pwd.sendKeys(pw);
	}
	public void clickPBPwdPageSignIn()
	{
		signIn.click();
		
	}

}
