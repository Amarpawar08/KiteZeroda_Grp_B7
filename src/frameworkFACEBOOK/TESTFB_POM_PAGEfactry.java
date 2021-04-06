package frameworkFACEBOOK;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TESTFB_POM_PAGEfactry {
public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	fbloginPOM_PAGefactry login=new fbloginPOM_PAGefactry(driver);
	
	login.setfbloginPOM_PAGefactryun();
	login.setfbloginPOM_PAGefactrypwd();
	login.clickfbloginPOM_PAGefactryloginbtn();
	Thread.sleep(5000);
	login.clickfbloginPOM_PAGefactryCLOSEbtn();
	
}
}
