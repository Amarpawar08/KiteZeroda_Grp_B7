package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ss1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.facebook.com");
          
	                     File source=((TakesScreenshot)rk).getScreenshotAs(OutputType.FILE);
	                      
	                     System.out.println(source);
	                      
	                     // executed ss taken in memory
	                     //to move in local memory create object for new destination
	                     //File dest= new File("C:\\Users\\admin\\Desktop\\screenshot\\rk1.jpg");
	                      
	                     // System.out.println(dest);
	                      
	                     //to move call filehandler 
	                     // FileHandler.copy(source, dest);
	                      
	                     String random = RandomString.make(3);
	                     File dest= new File("C:\\Users\\admin\\Desktop\\screenshot\\rk1"+random+".jpg");
	                     
	                     System.out.println(dest);
	                     
	                     FileHandler.copy(source, dest);
	                     
	                      
	                      
}
}
