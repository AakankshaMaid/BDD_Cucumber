package Demo2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage {
	@FindBy(xpath="//input[@id='outlined-secondary']")private WebElement fullname;
	WebDriver driver1;
	
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	public void switchtowindow()
	{
		Set<String> ids=driver1.getWindowHandles();
		ArrayList<String> al=new ArrayList(ids);
		driver1.switchTo().window(al.get(1));
	}
	public void verifyPBProfilePagefullname()
	{
		String actu = fullname.getAttribute("value");
		String expt="Jan batch";
		if(actu.equals(expt))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}
	
}
