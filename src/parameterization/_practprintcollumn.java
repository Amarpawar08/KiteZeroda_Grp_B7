package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _practprintcollumn {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\practice1.xlsx");
	
	
	Sheet sh= WorkbookFactory.create(xls).getSheet("Sheet1");
	
	int rowsize=sh.getLastRowNum();
	System.out.println(rowsize);
	
	for(int i=0; i<=rowsize; i++) {
		
		String value=sh.getRow(i).getCell(0).getStringCellValue();
		System.out.println(value);
	}
	
}
}
