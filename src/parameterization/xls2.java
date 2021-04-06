package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xls2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream xlsfile= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
	Workbook book= WorkbookFactory.create(xlsfile);
	Sheet sh= book.getSheet("Sheet2");
	Row rw=sh.getRow(0);
	Cell cell=rw.getCell(3);
	String value= cell.getStringCellValue();
	System.out.println(value);
	//System.out.println(cell.getStringCellValue());
}
}
