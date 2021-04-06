package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webelement1;

public class HiddenDivision {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver rk= new ChromeDriver();
	rk.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	rk.get("https://www.flipkart.com/");
	Thread.sleep(5000);
	
	WebElement un=rk.findElement(By.xpath("//input[@type='text']"));
	
	un.sendKeys("rahulkere");
	
	WebElement pwd=rk.findElement(By.xpath("//input[@type='password']"));
	pwd.sendKeys("123456");
	
	WebElement close=rk.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	close.click();
	
}
}
