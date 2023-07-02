package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example12_Multi_Browser_Parallel_Testing 
{
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException
	{
		WebDriver driver=null;
		
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
//		if(browserName.equals("firefox"))
//		{
//			driver=new FirefoxDriver();
//		}
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
