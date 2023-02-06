package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String getTestData(int row,int cell) throws EncryptedDocumentException, IOException
	{
	FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Insurance\\src\\test\\resources\\ExcelSheet\\TCEXCEL.xlsx");
	
	Sheet Sheet = WorkbookFactory.create(file).getSheet("Sheet1");

	String cell1 = Sheet.getRow(row).getCell(cell).getStringCellValue();
	System.out.println(cell1);

	return cell1;	
	
	}
	
	public static String captureScreenshot(WebDriver driver,int tcID) throws IOException
	{
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Dest=new File("C:\\Users\\Admin\\eclipse-workspace\\Insurance\\target\\ScreenShots\\"+tcID+".jpeg");
		FileHandler.copy(source, Dest);
		
		return Dest.toString();			//File la String Madhe Convert kel
	}

}
