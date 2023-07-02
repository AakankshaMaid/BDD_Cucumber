package POM_DDF_TestNG;

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

public class PBUtilityClass 
    //@AuthorName: Aakanksha
	//This method is use to get Test data from excel.
	//need to pass 2 inputs: 1-rowIndex(a), 2-colIndex(b)
{
	public static String Excel(int a,int b) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		String data=WorkbookFactory.create(file).getSheet("DDF").getRow(a).getCell(b).getStringCellValue();
		return data;
	}
	//this method is use to capture SS when TC get fail
	public static void captureSS(WebDriver driver,int TCID) throws IOException
	{
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Velocity class\\selenium\\SCREENSHOTS\\takeScr"+TCID+".jpg");
		FileHandler.copy(scr, dest);
		
	}
	//this Property class is use to fetch credential,private,UN,PW details from property file
	public static String getPFdata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\aakan\\git\\28thJanSelenium\\src\\POM_DDF_TestNG_BaseClass_UtilityClass_CaptureSSOfFailedTCes_PropertyFile\\PropertyFile.properties");
		Properties p=new Properties();
		p.load(file);  //load() method is use to open the excel file
		String value=p.getProperty(key);
		return value;
	}

}
