package selenium;



import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("http://www.facebook.com");
	
    rk.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("yesboss");
	//input[@class='inputtext _55r1 _6luy']
	rk.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
	
	rk.findElement(By.xpath("//button[@name='login']")).click();
	
	org.openqa.selenium.Point p=new org.openqa.selenium.Point(300, 300);
	rk.manage().window().setPosition(p);
	
}
}
