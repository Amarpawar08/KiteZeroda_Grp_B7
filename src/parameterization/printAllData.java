package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRow;

public class printAllData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\practice1.xlsx");
	
	
	Sheet sh=WorkbookFactory.create(xls).getSheet("Sheet2");
	
	//for(int i=0; i<=sh.getLastRowNum();i++) {
	//	for(int j=0; j<=sh.getRow(i).getLastCellNum()-1; j++) {
			
	//		String value=sh.getRow(i).getCell(j).getStringCellValue();
	//		System.out.print(value);
	//	}System.out.println();                                                      //method 1
	//}
	
	
	int rowsize=sh.getRow(0).getLastCellNum();                                  //method 2
	
	for(int i=0; i<=rowsize; i++) {
		
		int collsize1=sh.getRow(i).getLastCellNum()-1;
		for(int j=0; j<=collsize1; j++) {
			String value= sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
	}System.out.println();
		}
	
	
}
}
