package _WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4printcoll1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("file:///C:/Users/admin/Documents/webtable.html");
	Thread.sleep(2000);
	
	List<WebElement> coll1=rk.findElements(By.xpath("//table[@id='1234']//th[1]"));  //mtching 1 of 5
	
	for(WebElement printcoll1:coll1) {
		
		System.out.println(printcoll1.getText());
	}
	
	
	
	List<WebElement> coll2=rk.findElements(By.xpath("//table[@id='1234']//tr/th[2]"));   //matching 1 of 5
	
	for(WebElement printcoll2 :coll2) {
		
		System.out.println(printcoll2.getText());
	}
	
	
}
}
