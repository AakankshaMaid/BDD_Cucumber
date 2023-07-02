package POM_DDF_TestNG;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBBaseClass
{
	WebDriver driver;
	
	public void OpenBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.get(PBUtilityClass.getPFdata("URL"));
	}

}
