package Test_NG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_NormalTestClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
