package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _3methods {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	//******** AT A TIME ONLY 1 METHOD  ********
	
	FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
	
	//String value=WorkbookFactory.create(xls).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
	//System.out.println(value);                                        
	
	
	//String value1=WorkbookFactory.create(xls).getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
	//System.out.println(value1);                                          //getCell(1).  exception numeric vs string do '400 
	
	double value2= WorkbookFactory.create(xls).getSheet("Sheet2").getRow(0).getCell(1).getNumericCellValue();
	System.out.println(value2);
	
	//boolean value3 =WorkbookFactory.create(xls).getSheet("Sheet2").getRow(0).getCell(2).getBooleanCellValue();
	//System.out.println(value3);
	
	
}
}
