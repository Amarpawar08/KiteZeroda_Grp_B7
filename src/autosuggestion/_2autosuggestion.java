package autosuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2autosuggestion {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.iimb.ac.in/mgnf");
	Thread.sleep(2000);
	
	//WebElement search =rk.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	

	
	
	
	
}
}
