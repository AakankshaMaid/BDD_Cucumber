package Test_NG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example11_parallel_run2 
{
	@Test
	public void TC1() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    Thread.sleep(4000);
	    driver.quit();
	}

}
