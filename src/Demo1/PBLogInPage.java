package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInPage {
	@FindBy(xpath="//a[text()='Sign in']")private WebElement signin;
	
	public PBLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickPBLogInPagesignin()
	{
		signin.click();
	}
	

}
