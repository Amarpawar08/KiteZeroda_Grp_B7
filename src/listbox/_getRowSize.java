package listbox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class _getRowSize {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream data= new FileInputStream("C:\\Users\\admin\\Desktop\\excel sheet\\Book1.xlsx");
	//int rowsize=WorkbookFactory.create(data).getSheet("Sheet2").getLastRowNum();
	
	//System.out.println(rowsize+1);   //+1 is due to row index from 0 zero so to get total number +1
	
	int cellsize= WorkbookFactory.create(data).getSheet("Sheet2").getRow(0).getLastCellNum();
	
	System.out.println(cellsize);    // no need of +1 because collumn store directly
	
	
	
}
}
