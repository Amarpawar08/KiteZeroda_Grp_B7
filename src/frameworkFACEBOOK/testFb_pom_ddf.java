package frameworkFACEBOOK;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testFb_pom_ddf {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		FileInputStream xls= new FileInputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\excel sheet\\ddf.xlsx");
		Sheet sh = WorkbookFactory.create(xls).getSheet("ddffb");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fbloginpagePom_DDF login=new fbloginpagePom_DDF(driver);
		login.setfbloginpageun(sh.getRow(0).getCell(0).getStringCellValue());
		login.setfbloginpagepwd(sh.getRow(0).getCell(1).getStringCellValue());
		login.clickfbloginpageloginbtn();
		login.clickfbloginpageCLOSEbtn();
		
		
		
	}
	
	
	
}
