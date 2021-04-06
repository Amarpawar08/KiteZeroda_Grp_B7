package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _linkSize {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("https://www.facebook.com");
	Thread.sleep(3000);
	
	
	List<WebElement> alllink=rk.findElements(By.xpath("//a"));
	
	int linksize=alllink.size();
	System.out.println("total no of link present in fb webpage:"+linksize);
	
	
	for(WebElement link:alllink) {
		
		String linktext=link.getText();
		System.out.println(linktext);
	}
	
	
}
}
