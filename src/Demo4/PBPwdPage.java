package Demo4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage 
{
	@FindBy(xpath="//input[@id='central-login-password']")private WebElement pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signin;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inputPBPwdPagepwd(String pw)
	{
		pwd.sendKeys(pw);
	}
	public void clickPBPwdPagesiginin()
	{
		signin.click();
	}

}
