package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	

	 drive.get("https://www.google.com");
	String acttitle = drive.getTitle();
	System.out.println(acttitle);

	String exptitle="Google";
	// acttitle="https://www.google.com";
	
	if(acttitle.equals(exptitle)) {
		System.out.println("navigated correct page");
	}
	else  {
		System.out.println("navigated wrong page");
	}
	
	String url = drive.getCurrentUrl();    //url local avrble to store url value
	System.out.println(url);             
	
	drive.manage().window().maximize();     // we cannot minimize widw only resize brwser size
	
	Thread.sleep(2000);

	drive.navigate().to("https://www.google.com");
	//	Thread.sleep(2000);

	drive.navigate().to("https://www.facebook.com");
	//	Thread.sleep(2000);
	drive.navigate().to("http://www.amazon.com");
	drive.navigate().back();
	drive.navigate().forward();
	drive.navigate().refresh();
	
	
	
	
	
	
	
	
	
}
}

