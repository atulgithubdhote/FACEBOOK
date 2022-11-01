package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {
public static 	String value;
public static void scrrenshot(WebDriver driver,double testID) throws Exception {
	 SimpleDateFormat dateformate = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");  
     Date d = new Date();// Your each screenshot will be taken as this format "Year-Month-Date-Hours-Minutes-Seconds"
   String newdate=  dateformate .format(d);
     
     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dst= new File("C:\\velocity\\testscreenshot\\"+testID+" "+newdate+".jpg");      //your screenshot path and convert date string to SimpleDateFormat because windows can't capture screenshot with(:)

    FileHandler.copy(scrFile, dst);
}
public static String geteceldata(String  sheet,int row,int cell) throws Exception{
		String path="C:\\Users\\M8IN\\OneDrive\\Desktop\\QUESIONS.xlsx";
		FileInputStream fil=new FileInputStream(path);
		//Sheet sht=WorkbookFactory.create(fil).getSheet("A");
		Workbook w=WorkbookFactory.create(fil);
	try {
			value=	w.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	}
	catch(Exception e){
		double d=	w.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		Long l=(long) d;/// convert double(0.00) to long 00
		    value =Long.toString(l);
		    return value;}
	return value;
}
}
