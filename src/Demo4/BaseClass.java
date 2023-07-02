package Demo4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_DDF_TestNG.PBUtilityClass;

public class BaseClass 
{
	WebDriver driver;
	
	public void initializeBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(PBUtilityClass.getPFdata("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
