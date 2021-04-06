package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _getRows_collumn_size {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	
	//int  rowsize=WorkbookFactory.create(xls).getSheet("Sheet2").getLastRowNum();
	//System.out.println(rowsize+1);                                                             rowsize
	
	int collsize =WorkbookFactory.create(xls).getSheet("Sheet2").getRow(0).getLastCellNum();
	
	System.out.println(collsize);
	                                                                                              //  collun size
}
}
