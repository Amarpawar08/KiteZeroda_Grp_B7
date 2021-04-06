package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class index {
public static void main(String[] args) {
	
	//System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	//WebDriver rk=new ChromeDriver();
	
	//
	//rk.findElement(By.xpath("//input[@type='text']")).sendKeys("rahul");
	//rk.findElement(By.xpath("//input[@type='text']")).sendKeys("9999");
	//rk.findElement(By.xpath("//input[@type='text']")).sendKeys("kjb5");

//	System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	//WebDriver rk=new ChromeDriver();
	
	//	rk.get("C://Users//admin//Documents//index.html");
//	rk.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rahul");
//	rk.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("9999");
	//rk.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("kjb5");

	System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32 (1)//chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	
	rk.get("C://Users//admin//Documents//index.html");
	rk.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("rahul");
	rk.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("rk20");
	rk.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("8888888888");
    rk.findElement(By.linkText("google")).click();
	
	
}
}
