package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlssheet1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream sheet= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	String data= WorkbookFactory.create(sheet).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	
	System.out.println(data);
	
	
FileInputStream sheet1 =new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
String data1 = WorkbookFactory.create(sheet1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

System.out.println(data1);
	
	FileInputStream sheet2 =new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
	String data2 = WorkbookFactory.create(sheet2).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	
	System.out.println(data2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
