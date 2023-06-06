package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example2_TestNg_Test_class {
	
	@Test
	public void m1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.quit();
	}

}
