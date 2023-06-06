package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInPage {
	@FindBy(xpath="//a[text()='Sign in']")private WebElement signIn;
	
	public PBLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickPBLogInPageSignIn()
	{
		signIn.click();
	}

}
