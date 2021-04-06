package autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium.webelement1;

public class autosuggestion {
public static void main(String[] args) throws InterruptedException {
	
	String exttext="iphone 12 pro";

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.google.com");
	Thread.sleep(2000);
	
	WebElement search= rk.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	 
	search.sendKeys("iphone");
	Thread.sleep(2000);
	
	List<WebElement> alloption=rk.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	System.out.println(alloption.size());
	
	
	for(WebElement option:alloption) {
		
		String acttext=option.getText();
		if(acttext.equals(exttext)) {
		option.click();
		}
		

		
	}
	
	
	
}
}
