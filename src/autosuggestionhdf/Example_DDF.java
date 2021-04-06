package autosuggestion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_DDF 
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("C:\\Users\\admin\\Desktop\\New folder (2)\\excel sheet\\ddf.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();

	driver.get("https://kite.zerodha.com/");
	Thread.sleep(5000);
	
	//enter UN
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
	
	//enter pwd
	String pwd = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	
	//click on login button
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	
	//enter pin
	String pin = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	
	//click on continue btn
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();

	//get profile name
	String actPN = driver.findElement(By.xpath("//div[@class='avatar']/span")).getText();
	String expPN=sh.getRow(0).getCell(3).getStringCellValue();
	
	if(expPN.equals(actPN)) 
	{
		System.out.println("Pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	Thread.sleep(4000);
	driver.close();
	
}
}
