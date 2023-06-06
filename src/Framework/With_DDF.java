package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class With_DDF {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policy%20bazaar&pb_campaign=Policy_Bazaar00Brand&gad=1&gclid=CjwKCAjwvdajBhBEEiwAeMh1UxqQiLVApmprF1ApugIpB2Fzva_6L0GxL_Mamih6NH3Jf6pfneBh_xoCTBwQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		//click on sign in btn
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		String value1=sh.getRow(0).getCell(0).getStringCellValue();
		//enter mob no.
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(value1);
		//click on login with PW btn
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		String value2=sh.getRow(0).getCell(1).getStringCellValue();
		//enter PW
		driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys(value2);
		//click on sign in btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		//click using actions class my account btn
		WebElement ele=driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		//click on my profile
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		//switch window
		Set<String> d = driver.getWindowHandles();
		ArrayList<String >al=new ArrayList<String>(d);
		driver.switchTo().window(al.get(1));
		//full name text box
		WebElement ele1=driver.findElement(By.xpath("//input[@id='outlined-secondary']"));
		String s1=ele1.getAttribute("value");
		String value3=sh.getRow(0).getCell(2).getStringCellValue();
		String s2=value3;
		if(s1.equals(s2))
		{
			System.out.println("TC pass");
		}
		else
		{
			System.out.println("TC fail");
		}
		driver.quit();
		
	}
	
    
}



