package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.facebook.com");
	
	rk.findElement(By.id("email")).sendKeys("rjkdjsn");
	rk.findElement(By.name("pass")).sendKeys("68735");
	rk.findElement(By.name("login")).click();
	rk.findElement(By.className("_97w4")).click();
	rk.findElement(By.xpath("//input[@type='text']")).sendKeys("9865656566");
	rk.findElement(By.xpath("//button[contains(@class,'_42ft ')]")).click();
	rk.findElement(By.xpath("//a[@role='button']")).click();
	rk.findElement(By.xpath("//a[@class='_97w5']")).click();
	rk.findElement(By.name("birthday_day")).click();
	
	//rk.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("rk");
	//rk.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("4654");
	//rk.findElement(By.className("inputtext _55r1 _6luy _9npi")).click();
	
	
	//  class
	
}
	
}
