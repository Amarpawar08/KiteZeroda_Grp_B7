package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	
	 drive.get("https://www.google.com");
	 drive.navigate().refresh();
	 System.out.println(drive.manage().window().getSize());
	 
	 drive.manage().window().maximize();
	 System.out.println(drive.manage().window().getPosition());
	 
	 Thread.sleep(3000);
	 Dimension d1=new Dimension(500, 500);
	 drive.manage().window().setSize(d1);
	 
	 System.out.println(drive.manage().window().getSize());
	
}

}
