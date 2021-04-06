package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _printcollumn {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	FileInputStream xls=new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
	Sheet sh=WorkbookFactory.create(xls).getSheet("Sheet3");
	
	int rowsize=sh.getLastRowNum();
	
	for(int i=0; i<=rowsize; i++) {
		
		double value = sh.getRow(i).getCell(0).getNumericCellValue();
		System.out.println(value);
		
		//int valu=(int) sh.getRow(i).getCell(0).getNumericCellValue();
		//System.out.println(valu);
		
		//double c1=sh.getRow(i).getCell(1).getNumericCellValue();
		//System.out.println(c1);
		
		//int c11= (int) sh.getRow(i).getCell(1).getNumericCellValue();
		//System.out.println(c11);
		
		
	}
	
	
	
}
}
