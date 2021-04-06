package autosuggestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream sh= new FileInputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\excel sheet\\practice1.xlsx");
		//String book= WorkbookFactory.create(sh).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		//String bookk= WorkbookFactory.create(sh).getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		String bookkk= WorkbookFactory.create(sh).getSheet("Sheet2").getRow(0).getCell(2).getStringCellValue();
		//double book=WorkbookFactory.create(sh).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		//boolean book2=WorkbookFactory.create(sh).getSheet("Sheet2").getRow(0).getCell(2).getBooleanCellValue();
		//String book3=WorkbookFactory.create(sh).getSheet("Sheet2").getRow(0).getCell(3).getStringCellValue();
		//String book33= WorkbookFactory.create(sh).getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
		
		//System.out.println(book);    // 400 exception '400 leftshift xls 400
		//System.out.println(bookk);
		System.out.println(bookkk);
		//System.out.println(book2);
		//System.out.println(book3);
		//System.out.println(book33);
		
		// at a time only one function
		
		
		
	}
	
	
}
