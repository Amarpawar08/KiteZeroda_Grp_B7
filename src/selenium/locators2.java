package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.facebook.com");
	
	rk.findElement(By.xpath("//input[@id='email']")).sendKeys("Duryodhan");
	rk.findElement(By.xpath("//input[@id='pass']")).sendKeys("12456");
	
	
	rk.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
	
	
	
	
	
	
	
}
}
