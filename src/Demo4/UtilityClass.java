package Demo4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	public static String Excel(int a,int b) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\\\Velocity class\\\\selenium\\\\New Microsoft Excel Worksheet.xlsx");
		String data=WorkbookFactory.create(file).getSheet("DDF").getRow(a).getCell(b).getStringCellValue();
		return data;
	}
	
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\\\Velocity class\\\\selenium\\\\SCREENSHOTS\\\\takeScr"+TCID+".jpg");
		FileHandler.copy(scr, dest);
		
	}
	public static String getPFdata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\aakan\\OneDrive\\Desktop\\Selenium_Framework\\src\\Demo4\\propertyFile.properties");
		Properties p=new Properties();
		p.load(file);
		String s1=p.getProperty(key);
		return s1;
	}

}
