package selenium;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelement1 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	WebDriver rk= new ChromeDriver();
	
	rk.get("https://www.facebook.com");
	String url=rk.getCurrentUrl();
	System.out.println(url);
	
// boolean logo= rk.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	//System.out.println(logo);
	
//	if(logo==true) {
//		System.out.println("element displayed on webpage");
//	}
//	else {
//		System.out.println("element not displayed");
//	}
	
	boolean logo= false;      // intensionally provide krto logo nsel tr
	try {
		rk.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	}
	catch(NoSuchElementException e) {
		System.out.println("exception handled");
	}
	System.out.println(logo);
	
	if(logo==true) {
		System.out.println("displayed");
	}
	else {
		System.out.println("not displayed");
	}
	
		
	
	boolean login=rk.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).isDisplayed();
	System.out.println(login);
	
	if(login==true) {
		System.out.println("displayed");
	}
	else {
		System.out.println("not dosplayed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
