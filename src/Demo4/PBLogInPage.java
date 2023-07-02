package Demo4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogInPage 
{
	@FindBy(xpath="//a[text()='Sign in']")private WebElement sigin;
	
	public PBLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickPBLogInPagesigin()
	{
		sigin.click();
	}
	

}
