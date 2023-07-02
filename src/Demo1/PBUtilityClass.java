package Demo1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PBUtilityClass 
{
	public String Excel(int a,int b) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Velocity class\\selenium\\New Microsoft Excel Worksheet.xlsx");
		String Data=WorkbookFactory.create(file).getSheet("DDF").getRow(a).getCell(b).getStringCellValue();
		return Data;
	}

}
