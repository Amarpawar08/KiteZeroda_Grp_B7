package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _printAlldata {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
     Sheet sh=WorkbookFactory.create(xls).getSheet("Sheet3");
	
     int rowsize=sh.getLastRowNum();
     
     for(int i=0; i<=rowsize;i++) {
    	 
    	 int cellsize=sh.getRow(i).getLastCellNum()-1;
    	 for(int j=0; j<=cellsize;j++) {
    		 double value= sh.getRow(i).getCell(j).getNumericCellValue();
    		 System.out.print(value+"  ");
    	 }System.out.println();
    	 
     }
	
}
}
