package Demo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PB_LogIn_Page {
	@FindBy(xpath="//a[text()='Sign in']") WebElement SignIn;
	
	public PB_LogIn_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickPBLogInPageSignIn()
	{
		SignIn.click();
	}

}
