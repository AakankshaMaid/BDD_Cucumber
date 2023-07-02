package Demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage {
	@FindBy(xpath="//input[@id='central-login-password']")private WebElement Pwd;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignIn;
	
	public PBPwdPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void inputPBPwdPagePwd(String s2)
	{
		Pwd.sendKeys(s2);
	}
	public void clickPBPwdPageSignIn()
	{
		SignIn.click();
	}

}
