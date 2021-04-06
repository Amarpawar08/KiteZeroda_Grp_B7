package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart_contains {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	WebDriver rk =new ChromeDriver();
	rk.get("https:/www.amazon.com");
	
	rk.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();

	rk.findElement(By.xpath("//input[contains(@class,'h-requi')]")).sendKeys("rahulrk");
    //rk.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("rahulkere");
	
	rk.findElement(By.xpath("//input[contains(@class,'utto')]")).click();
	rk.findElement(By.xpath("//span[contains(@class,'pander')]")).click();
	
	rk.findElement(By.xpath("//a[contains(@id,'-fpp-li')]")).click();
	//rk.findElement(By.xpath("//a[contains(@text(),'   Forgot your password?')]")).click();
	
	
}
}
