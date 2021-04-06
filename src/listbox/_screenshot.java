package listbox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class _screenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.facebook.com");
	
	File ss=((TakesScreenshot)rk).getScreenshotAs(OutputType.FILE);
	System.out.println(ss);
	File desti=new File("C:\\Users\\admin\\Desktop\\screenshot\\xyz1.jpg");
	FileHandler.copy(ss, desti);
	
	Thread.sleep(5000);
	rk.get("https://youtu.be/sCbbMZ-q4-I");
	Thread.sleep(10000);
	File source=((TakesScreenshot)rk).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	
	
	//String random= RandomString.make(3);
	
	
	File dest=new File("C:\\Users\\admin\\Desktop\\screenshot\\xyz2.jpg");
	//File dest=new File("C:\\Users\\admin\\Desktop\\screenshot\\xyz2"+random+"jpg");
	FileHandler.copy(source, dest);
	
}
}
