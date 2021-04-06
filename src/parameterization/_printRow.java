package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _printRow {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
	//int cellize=WorkbookFactory.create(xls).getSheet("Sheet2").getRow(0).getLastCellNum();
	
	//for(int i=0; i<=cellize-1; i++) {
		
		// ???? sheet object  ????
	//}
	
    org.apache.poi.ss.usermodel.Sheet sh= WorkbookFactory.create(xls).getSheet("Sheet3");
	 
	Short cellsize =sh.getRow(0).getLastCellNum();
	System.out.println(cellsize);
	for(int i=0; i<=cellsize-1; i++) {
		
		double value =sh.getRow(0).getCell(i).getNumericCellValue();
		System.out.println(value+" ");
		
		
				
	}
	

	
	
	
}
}
