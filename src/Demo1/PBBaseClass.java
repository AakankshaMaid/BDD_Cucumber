package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBBaseClass 
{
	WebDriver driver;
	
	public void opneBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
	}

}
