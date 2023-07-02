package Shortcut_extension_For_Find_LocatorPath;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example1_chroPath {
	

	
	public static void main(String[] args) 
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
			
		}

	}

//chroPath is extension use with chrome browser for find shortcut xpath
