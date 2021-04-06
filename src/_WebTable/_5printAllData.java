package _WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5printAllData {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver rk=new ChromeDriver();
	rk.get("C:\\Users\\admin\\Documents\\webtable.html");
	Thread.sleep(2000);
	
	for(int i=1;i<=5; i++) {
		
		for(int j=1; j<=3; j++) {
			
			String text=rk.findElement(By.xpath("//table[@border='10']//tr["+i+"]//th["+j+"]")).getText();
			System.out.print(text+"   ");
			
		}System.out.println();
		
		
		
		
		
	}
	
	
	
}
}
