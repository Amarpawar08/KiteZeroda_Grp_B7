package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class prinrow2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream xls=new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\practice1.xlsx");
	
	Sheet sheet=WorkbookFactory.create(xls).getSheet("Sheet1");
	
	int collunsize=sheet.getRow(0).getLastCellNum();
	
	for(int i=0; i<=collunsize-1; i++) {
		
		String value=sheet.getRow(0).getCell(i).getStringCellValue();
		
		System.out.print(value);
		
	}
	
	
}
}
