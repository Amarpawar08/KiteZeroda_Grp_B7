package _WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3Printrow1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("file:///C:/Users/admin/Documents/webtable.html");
	Thread.sleep(2000);
	
	List<WebElement> row1 =rk.findElements(By.xpath("//table[@id='1234']//tr[1]/th"));  //matching 1 of 3
	System.out.println(row1.size()+"collsize");
	for(WebElement printrow1:row1) {
	
		System.out.print(printrow1.getText());
	}
	System.out.println();
	
	List<WebElement> row2=rk.findElements(By.xpath("//table[@id='1234']//tr[2]"));  //matching 1 of 3
	
	for(WebElement printrow2 :row2) {
			System.out.print(printrow2.getText());
	}
	
}
}
