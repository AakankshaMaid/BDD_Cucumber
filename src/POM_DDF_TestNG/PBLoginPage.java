package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	@FindBy(xpath="//a[text()='Sign in']")private WebElement sigin;
	
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBLoginPagesigin()
	{
		sigin.click();
	}
	

}
