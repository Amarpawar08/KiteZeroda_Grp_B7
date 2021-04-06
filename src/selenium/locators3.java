package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	
	rk.get("https://www.amazon.com");
	//rk.findElement(By.xpath(xpathExpression))
	rk.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
	rk.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}
}
