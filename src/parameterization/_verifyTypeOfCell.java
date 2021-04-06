package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class _verifyTypeOfCell {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
       Cell cellvalue= WorkbookFactory.create(xls).getSheet("Sheet3").getRow(0).getCell(6);
         
       org.apache.poi.ss.usermodel.CellType ct=cellvalue.getCellType();
       System.out.println(ct);
       
     if(ct==org.apache.poi.ss.usermodel.CellType.STRING) {
    	 String value=cellvalue .getStringCellValue();
    	 System.out.println(value);
     }
    	 else if(ct==org.apache.poi.ss.usermodel.CellType.NUMERIC) {
    		 
    		double value= cellvalue.getNumericCellValue();
    		System.out.println(value);
    	 }
     else if(ct==org.apache.poi.ss.usermodel.CellType.BOOLEAN){
		
    	boolean value= cellvalue.getBooleanCellValue();
    	 System.out.println(value);
	}
    	 
    	 
     
       
       
       
       
}
}
