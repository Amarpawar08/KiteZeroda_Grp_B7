package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sample2 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	
	 drive.get("https://www.google.com");
	
	drive.navigate().to("https://www.facebook.com");
	drive.navigate().back();
	drive.manage().window().maximize();
	Thread.sleep(2000);
	Dimension d1= new Dimension(200,500);
	drive.manage().window().setSize(d1);	
	
	
	
	
	
	
	
}	
}
