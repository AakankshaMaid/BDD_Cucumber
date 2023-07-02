package POM_DDF_TestNG;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage
{
	@FindBy(xpath="(//input[@id='outlined-secondary'])[1]")private WebElement fullname;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchToWindow()
	{
		Set<String> ids=driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList(ids);
		driver1.switchTo().window(al.get(1));
	}
	public String verifyPBProfilePagefullname()
	{
		String actua1=fullname.getAttribute("value");
		return actua1;
	}
	

}
