package Demo3;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyProfilePage {
	@FindBy(xpath="//input[@name='personName']")private WebElement fullname;
	WebDriver driver1;
	
	public PBMyProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void SwitchToPage()
	{
		Set<String> ids=driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList(ids);
		driver1.switchTo().window(al.get(1));
	}
	public void VerifyPBMyProfilePageFullname(String s3)
	{
		String Actu=fullname.getAttribute("value");
		
		if(Actu.equals(s3))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}
	
	
	

}
