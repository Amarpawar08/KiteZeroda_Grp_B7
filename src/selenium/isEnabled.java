package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.facebook.com");
	//WebElement loginbutton=rk.findElement(By.xpath("//button[@name='login']"));
	
	//boolean a=loginbutton.isDisplayed();
	//System.out.println(a);
	
	boolean a=rk.findElement(By.xpath("//button[@name='login']")).isDisplayed();
	System.out.println(a);
	if(a==true) {
		System.out.println("displayed");
	}
	else {
		System.out.println("not displayed");
	}
	
	//boolean a1 = loginbutton.isEnabled();
	
	boolean a1=rk.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).isEnabled();
	System.out.println(a1);
	if(a1==true) {
		System.out.println("enabled");
	}
	else {
		System.out.println("not enabled");
	}
	
	
	
	
	
	
}
}
