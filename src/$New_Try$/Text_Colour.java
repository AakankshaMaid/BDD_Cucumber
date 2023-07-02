package $New_Try$;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Text_Colour
{
	@Test
	public  void TC1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazaar&pb_campaign=Policy_Bazaar00Brand&gad=1&gclid=CjwKCAjwvdajBhBEEiwAeMh1UxqQiLVApmprF1ApugIpB2Fzva_6L0GxL_Mamih6NH3Jf6pfneBh_xoCTBwQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//click on sign in btn
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		//enter mob no.
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]"));
		//click on login with PW btn
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("(//span[@id='error-sign-in'])[2]"));
		
		String colour=ele.getCssValue("color");
		String code=Color.fromString(colour).asHex();
		
		if(code.equals("#de350b"))
		{
			Reporter.log("Error msg text colour is RED",true);
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
